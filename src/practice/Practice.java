package practice;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		WebDriver d = new ChromeDriver(co);
		d.get("https://www.amazon.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// getting list of all links and image links
		List<WebElement> linkslist = d.findElements(By.tagName("a"));
		linkslist.addAll(d.findElements(By.tagName("img")));
		System.out.println("Size of Links and image links " + linkslist.size());
		// creating one more list to store only active links
		List<WebElement> activelinks = new ArrayList<WebElement>();
		for (int i = 0; i < linkslist.size(); i++) {
			if (linkslist.get(i).getAttribute("href") != null) {
				activelinks.add(linkslist.get(i));
			}
		}
		System.out.println("Active links count " + activelinks.size());
		for (int j = 0; j < activelinks.size(); j++) {
			WebElement ele = activelinks.get(j);
			String linksurl = ele.getAttribute("href");
			try {
				URL url = new URL(linksurl);
				HttpURLConnection con = (HttpURLConnection) url.openConnection();
				con.setConnectTimeout(3000);
				con.connect();
				if (con.getResponseCode() == 200) {
					System.out.println(linksurl + " - " + con.getResponseMessage());
				} else if (con.getResponseCode() == HttpURLConnection.HTTP_NOT_FOUND) {
					System.out.println(linksurl + " - " + con.getResponseMessage() + HttpURLConnection.HTTP_NOT_FOUND);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
