package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Drag and Drop")).click();
		WebElement from = driver.findElement(By.id("column-a"));
		WebElement to = driver.findElement(By.id("column-b"));
		Actions act = new Actions(driver);
		// act.dragAndDrop(from, to).build().perform();
		act.clickAndHold(from).moveToElement(to).release().build().perform();
	}

}
