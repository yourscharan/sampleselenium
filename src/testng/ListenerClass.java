package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testng.ITESTLISTENER.class)
public class ListenerClass {

	@Test // Passing Test
	public void sampleTest1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apple.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.quit();
	}

	@Test // Failing Test
	public void sampleTest2() throws InterruptedException {
		System.out.println("Forcely Failed Test Method");
		Assert.assertTrue(false);
	}

	/*
	 * TestNG calculates the success percentage based on the number of successful
	 * invocations out of the total invocationCount. In the example below, with
	 * invocationCount=5 and successPercentage=60, the test would pass if at least 3
	 * out of 5 invocations are successful ((3/5) * 100 = 60%).
	 * 
	 * onTestFailedButWithinSuccessPercentage:
            TestNG provides a listener method, onTestFailedButWithinSuccessPercentage, 
            that is invoked when an individual test invocation fails but the overall 
            success percentage for the method is still met. This allows you to log or 
            handle these partial failures without marking the entire test as a failure.
	 * 
	 * 
	 * 
	 */

	private int i = 0;

	@Test(successPercentage = 60, invocationCount = 5) // Test Failing But
														// Within Success Percentage
	public void sampleTest3() {
		i++;
		System.out.println("Test Failed But Within Success Percentage Test Method, invocation count: " + i);
		if (i == 1 || i == 2) {
			System.out.println("sampleTest3 Failed");
			Assert.assertEquals(i, 6);
		}
	}

	@Test // Skipping Test
	public void sampleTest4() {
		throw new SkipException("Forcely skipping the sampleTest4");
	}

}
