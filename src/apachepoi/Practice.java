package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Practice {
	public static String testdatasheetpath = "E:\\Practice\\SampleSelenium\\testdata\\OrangeHRM.xlsx";
	public static Workbook book;
	public static Sheet sheet;

	@DataProvider(name = "logindata")
	public Object[][] dataprovider() throws EncryptedDocumentException, IOException {
		Object[][] data = gettestdata(testdatasheetpath);
		return data;
	}

	private Object[][] gettestdata(String testdatasheetpath2) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(testdatasheetpath);
		book = WorkbookFactory.create(fis);
		sheet = book.getSheetAt(1);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
			}
		}
		return data;
	}

	@Test(dataProvider = "logindata")
	public void loginhrm(String username, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String expval = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String actval = driver.getCurrentUrl();
		Thread.sleep(1000);
		if (expval.equals(actval)) {
			Reporter.log("Login Success");
		} else {
			Reporter.log("Login Failed");
		}
		driver.quit();
	}

}
