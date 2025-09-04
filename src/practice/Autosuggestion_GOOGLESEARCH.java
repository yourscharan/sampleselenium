package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion_GOOGLESEARCH {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// clicking on Signout button if it prompts popup
		d.findElement(By.cssSelector("div.pXnwx>promo-button-text:nth-child(1)")).click();
		Thread.sleep(2000);
		d.findElement(By.name("q")).sendKeys("Testing");
		List<WebElement> li = d.findElements(By.xpath("//ul[@role='listbox']//li//div[@class='eIPGRd']"));
		System.out.println("Total suggestions " + li.size());
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
			if (li.get(i).getText().equals("testing course")) {
				li.get(i).click();
				break;
			}
		}
	}

}
