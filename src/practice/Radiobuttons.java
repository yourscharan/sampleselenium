package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobuttons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = new ChromeDriver(co);
		driver.get("file:///C:/Users/nagen/OneDrive/Desktop/radiobutton.html");
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));// based on latest selenium version
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='banana']")));
		driver.findElement(By.xpath("//input[@value='banana']")).click();
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
	}

}
