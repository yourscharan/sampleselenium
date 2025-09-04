package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class HRMLogin_using_Propertiesfile {
	public WebDriver driver;
	public Properties p;
	public FileInputStream fis;
	public String expval, actval;

	@BeforeMethod
	public void beforeMethod() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		p = new Properties();
		fis = new FileInputStream(System.getProperty("user.dir") + "\\OrangeHRM.properties");
		p.load(fis);
		driver.get(p.getProperty("URL"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	}

	@Test
	public void Login() throws Exception {
		driver.findElement(By.xpath(p.getProperty("Objun"))).sendKeys(p.getProperty("username"));
		driver.findElement(By.xpath(p.getProperty("Objpwd"))).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath(p.getProperty("Objlogin"))).click();
		expval = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		actval = driver.getCurrentUrl();
		Thread.sleep(1000);
		if(expval.equals(actval)) {
			Reporter.log("Login Success");
		}
		else {
			Reporter.log("Login Failed");
		}
	}

	@AfterMethod
	public void afterMethod() {
		driver.quit();
	}

}
