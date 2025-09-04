package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;

public class FilleUpload_Robot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.marionette.firefox", "E:\\drivers\\firefoxdriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practice.expandtesting.com/upload");
		driver.manage().window().maximize();
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		WebElement uploadButton = driver.findElement(By.xpath("//div//*[@id=\"fileInput\"]"));
		// executor.executeScript("arguments[0].click();", uploadButton);
		executor.executeScript("arguments[0].click", uploadButton);
		// uploadButton.click();
		Thread.sleep(2000);
		Robot rt = new Robot();
		StringSelection fileSelection = new StringSelection("C:\\Users\\nagen\\Downloads\\Testng.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);
		rt.delay(1000);
		rt.keyPress(KeyEvent.VK_CONTROL);
		rt.keyPress(KeyEvent.VK_V);
		rt.delay(1000);
		rt.keyRelease(KeyEvent.VK_CONTROL);
		rt.keyRelease(KeyEvent.VK_V);
		rt.delay(1000);
		rt.keyPress(KeyEvent.VK_ENTER);
		rt.delay(1000);
		rt.keyRelease(KeyEvent.VK_ENTER);

	}

}
