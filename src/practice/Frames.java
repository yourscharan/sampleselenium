package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().frame("frame1");
		String content = driver.findElement(By.cssSelector("#sampleHeading")).getText();
		System.out.println(content);
		driver.switchTo().parentFrame();
		// or
		driver.switchTo().defaultContent();
		String content1 = driver.findElement(By.cssSelector("h1.text-center")).getText();
		System.out.println(content1);
	}

}
