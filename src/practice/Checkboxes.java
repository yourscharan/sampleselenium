package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Checkboxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Checkboxes")).click();
		WebElement cb1=driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(1)"));
		WebElement cb2=driver.findElement(By.cssSelector("#checkboxes > input[type=checkbox]:nth-child(3)"));
		System.out.println(cb1.isDisplayed());
		System.out.println(cb2.isDisplayed());
		if(cb2.isSelected()) {
			System.out.println("checkbox 2 selected by default");
			cb2.click();
			cb1.click();
			if(cb1.isSelected()) {
				System.out.println("Checkbox 1 selected");
			}
		}
		
		driver.close();
	}

}
