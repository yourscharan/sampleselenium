package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PrintAllLinkNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// based on latest selenium version
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links are " + links.size());
		for (WebElement eachlink : links) {
			String linkName = eachlink.getText();
			System.out.println("Links Names are " + linkName);
		}

	}

}
