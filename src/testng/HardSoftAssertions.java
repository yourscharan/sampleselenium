package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardSoftAssertions {
	@Test
	public void TC1() {
		System.out.println("Test Case one Started");
		Assert.assertEquals(5, 5);
		System.out.println("Hard Assert success");
		Assert.assertTrue("Hello".equals(5));
		System.out.println("TC1 executed successfully");
	}
	
	@Test
	public void TC2(){
		SoftAssert s1=new SoftAssert();
		System.out.println("Test case two started ");
		s1.assertEquals("H", "H");
		System.out.println("Soft Assert success");
		s1.assertTrue("Hello".equals("bello"));
		System.out.println("TC2 executed successfully");
		s1.assertAll();
	}
}
