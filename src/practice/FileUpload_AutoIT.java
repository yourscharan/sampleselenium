package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class FileUpload_AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
//		ChromeOptions co = new ChromeOptions();
//		co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//		WebDriver driver = new ChromeDriver(co);
//		driver.get("https://the-internet.herokuapp.com/upload");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		WebElement uploadButton = driver.findElement(By.id("file-upload"));
//		uploadButton.click();
		Runtime.getRuntime().exec("C:\\Users\\nagen\\OneDrive\\Desktop\\notepad12.exe");
		
	}

}
