package testng;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot {

	@Test
	public void takeScreenshot() throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("D://Screenshot.jpg"));

		// screenshot with current date and time
//		DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
//		Date d = new Date();
//		String currentDateTime = df.format(d);
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileHandler.copy(src, new File("D://Screenshot" + currentDateTime + ".png"));
//		driver.close();

		DateFormat df = new SimpleDateFormat("YYYY_MM_dd hh_mm_ss");
		Date d = new Date();
		String currentdatetime = df.format(d);
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D://screenshot " + currentdatetime + ".png"));
		driver.close();

	}

}
