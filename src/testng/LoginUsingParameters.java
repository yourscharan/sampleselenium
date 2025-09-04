package testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginUsingParameters {
	public WebDriver driver;
	public WebDriverWait wait;

	@Parameters("url")
	@BeforeMethod
	public void setUp(String url) {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	}

	@Parameters({ "username", "password" })
	@Test
	public void Login(String username, String password) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String exptitle = "OrangeHRM";
		String acttitle = driver.getTitle();
		Assert.assertEquals(acttitle, exptitle);
//		if (exptitle.equals(acttitle)) {
//			System.out.println("LOGIN SUCCESS");
//		} else {
//			System.out.println("LOGIN FAILED");
//		}

	}

	@AfterMethod
	public void tearDown() {
		Actions act = new Actions(driver);
		WebElement parent = driver.findElement(By.cssSelector("span.oxd-userdropdown-tab"));
		act.moveToElement(parent).click().build().perform();
		wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		wait.until(
				ExpectedConditions.presenceOfElementLocated(By.cssSelector("ul.oxd-dropdown-menu>li:nth-child(4)>a")))
				.click();
		driver.close();
	}

}
