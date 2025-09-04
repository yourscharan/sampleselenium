package apachepoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

public class Login_HRM {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\testdata\\OrangeHRM.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheetAt(0);
		int rowCount = sh.getLastRowNum();
		for (int i = 1; i <= rowCount; i++) {
			System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();	
			co.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
			WebDriver driver = new ChromeDriver(co);
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			String username = sh.getRow(i).getCell(0).getStringCellValue();
			String password = sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("Username is " + username);
			System.out.println("Password is " + password);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			String expval = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
			String actval = driver.getCurrentUrl();
			if (expval.equals(actval)) {
				sh.getRow(0).createCell(2).setCellValue("RESULT");
				sh.getRow(i).createCell(2).setCellValue("LoginSuccess");
			} else {
				sh.getRow(0).createCell(2).setCellValue("RESULT");
				sh.getRow(i).createCell(2).setCellValue("LoginFailed");
			}
			driver.quit();
		}
		fis.close();
		FileOutputStream fos = new FileOutputStream(System.getProperty("user.dir") + "\\testdata\\OrangeHRM.xlsx");
		wb.write(fos);
		fos.close();
		wb.close();

	}

}
