package practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Sortable Data Tables")).click();
		int rowCount = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr")).size();
		System.out.println("No.Of rows" + rowCount);
		int colCount = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr[1]/td")).size();
		System.out.println("No.Of columns" + colCount);
		int cellCount = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td")).size();
		System.out.println("No.Of cells" + cellCount);
		for (int i = 1; i <= rowCount; i++) {
			for (int j = 1; j <= colCount; j++) {
				String data = driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[" + i + "]/td[" + j + "]"))
						.getText();
				System.out.println(data);
			}
		}
		// Printing cell data using Iterator concept
		System.out.println("Printing cell data using Iterator concept");
		List<WebElement> data = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr/td"));
		System.out.println("No.Of cells" + data.size());
		Iterator<WebElement> itr = data.iterator();
		while (itr.hasNext()) {
			WebElement values = itr.next();
			System.out.println(values.getText());
		}
		// Printing cell data using foreach concept
		System.out.println("Printing cell data using foreach concept");
		for (WebElement e1 : data) {
			System.out.println(e1.getText());
		}
		// Printing cell data using for loop concept
		System.out.println("Printing cell data using for loop concept");
		for (int i = 1; i <= data.size() - 1; i++) {
			System.out.println(data.get(i).getText());
		}
		driver.close();
	}

}
