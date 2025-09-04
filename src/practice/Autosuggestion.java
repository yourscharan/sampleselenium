package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		d.findElement(By.cssSelector("input#autocomplete")).sendKeys("sou");
		List<WebElement> li = d.findElements(By.cssSelector("ul#ui-id-1>li"));
		System.out.println("Total suggestions " + li.size());
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i).getText());
			{
				if (li.get(i).getText().equals("South Africa")) {
					li.get(i).click();
					break;
				}
			}
		}
	}

}
