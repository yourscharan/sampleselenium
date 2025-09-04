package practice;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
//		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("admin123");
//		driver.findElement(By.cssSelector("button[type='submit']")).sendKeys(Keys.ENTER);
//		Thread.sleep(2000);
//		String expecTitle=driver.getTitle();
//		if(expecTitle.equalsIgnoreCase("OrangeHRM")) {
//			System.out.println("Logged in Successfully");
//		}
//		else
//		{
//			System.out.println("Login failed");
//		}
//		
//	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		// Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// based on latest selenium version
		driver.findElement(By.linkText("Dropdown")).click();
		WebElement drp = driver.findElement(By.id("dropdown"));
		Select s = new Select(drp);
		s.selectByIndex(1);
		s.selectByVisibleText("Option 2");
		s.selectByValue("1");
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		String title = driver.getTitle();
		System.out.println(title);
		// printing all dropdown elements using iterator concept
		List<WebElement> ops = s.getOptions();
		Iterator<WebElement> itr = ops.iterator();
		while (itr.hasNext()) {
			WebElement ele = itr.next();
			System.out.println(ele.getText());
		}
		// printing all dropdown elements using foreach loop
		for (WebElement e1 : ops) {
			System.out.println(e1.getText());
		}
		// printing all dropdown elements using for loop
		for (int i = 0; i < ops.size(); i++) {
			System.out.println(ops.get(i).getText());
		}
	}

}
