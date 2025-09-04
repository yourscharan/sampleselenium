package practice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#tabButton")).click();
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> itr = ids.iterator();
		String firstid = itr.next();
		String secondid = itr.next();
		System.out.println(firstid);
		System.out.println(secondid);
		driver.switchTo().window(secondid);
		String text=driver.findElement(By.cssSelector("#sampleHeading")).getText();
		System.out.println(text);
		driver.close();//closing second window tab
		driver.switchTo().window(firstid);
		//clicking on NEW WINDOW button
		driver.findElement(By.cssSelector("#windowButton")).click();
		Set<String> ids1 = driver.getWindowHandles();
		Iterator<String> itr1 = ids1.iterator();
		String id1 = itr1.next();
		String id2 = itr1.next();
		System.out.println(id1);
		System.out.println(id2);
		driver.switchTo().window(id2);
		String text1=driver.findElement(By.cssSelector("#sampleHeading")).getText();
		System.out.println(text1);
		driver.close();//closing second window tab
		driver.switchTo().window(id1);
		driver.close();//closing overall parent window(id1)
	}

}
