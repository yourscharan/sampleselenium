package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("JavaScript Alerts")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("ul>li:nth-child(1)>button")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		String msg=driver.findElement(By.cssSelector("p#result")).getText();
		System.out.println(msg);
		System.out.println("**********************");
		if(msg.equalsIgnoreCase("You successfully clicked an alert")) {
			System.out.println("You successfully clicked an alert");
		}
		else {
			System.out.println("You did not successfully clicked an alert");
		}
		//
		driver.findElement(By.cssSelector("ul>li:nth-child(2)>button")).click();
		a.accept();
		String msg1=driver.findElement(By.cssSelector("p#result")).getText();
		System.out.println(msg1);
		System.out.println("***************************");
		if(msg1.equalsIgnoreCase("You clicked: Ok")) {
			System.out.println("You clicked: Ok");
		}
		else {
			System.out.println("You did not clicked: Ok");
		}
		//
		driver.findElement(By.cssSelector("ul>li:nth-child(2)>button")).click();
		a.dismiss();
		String msg2=driver.findElement(By.cssSelector("p#result")).getText();
		System.out.println(msg2);
		System.out.println("***************************");
		if(msg2.equalsIgnoreCase("You clicked: Cancel")) {
			System.out.println("You clicked: Cancel");
		}
		else {
			System.out.println("You did not  clicked: Cancel");
		}
		//
		driver.findElement(By.cssSelector("ul>li:nth-child(3)>button")).click();
		a.sendKeys("Hi How Are You!");
		a.accept();
		String msg3=driver.findElement(By.cssSelector("p#result")).getText();
		System.out.println(msg3);
		System.out.println("***************************");
		if(msg3.equalsIgnoreCase("You entered: Hi How Are You!")) {
			System.out.println(msg3);
		}
		else {
			System.out.println("You didnot entered: Hi How Are You!");
		}
		
		
	}

}
