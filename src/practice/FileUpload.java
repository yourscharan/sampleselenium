package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Assert;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		File uploadFile = new File("D:\\TestNG Interview Questions.pdf");
		ChromeOptions co = new ChromeOptions();
		co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement uploadButton = driver.findElement(By.id("file-upload"));
		uploadButton.sendKeys(uploadFile.getAbsolutePath());
		driver.findElement(By.id("file-submit")).click();
		String fileName = driver.findElement(By.id("uploaded-files")).getText();
		System.out.println(fileName);
		if(fileName.equals("TestNG Interview Questions.pdf")) {
			System.out.println("File uploaded successfully");
		}
		else {
			System.out.println("File Not uploaded successfully");
		}
		
//		Thread.sleep(2000);
//		Robot rt = new Robot();
//		StringSelection fileSelection = new StringSelection("C:\\Users\\nagen\\Downloads\\Testng.pdf");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(fileSelection, null);
//		rt.delay(1000);
//		rt.keyPress(KeyEvent.VK_CONTROL);
//		rt.keyPress(KeyEvent.VK_V);
//		rt.delay(1000);
//		rt.keyRelease(KeyEvent.VK_CONTROL);
//		rt.keyRelease(KeyEvent.VK_V);
//		rt.delay(1000);
//		rt.keyPress(KeyEvent.VK_TAB);
//		rt.keyRelease(KeyEvent.VK_TAB);
//		rt.delay(1000);
//		rt.keyPress(KeyEvent.VK_TAB);
//		rt.keyRelease(KeyEvent.VK_TAB);
//		rt.delay(1000);
//		rt.keyPress(KeyEvent.VK_ENTER);
//		rt.delay(1000);
//		rt.keyRelease(KeyEvent.VK_ENTER);
	}

}
