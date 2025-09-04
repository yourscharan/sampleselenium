package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGAnnotationAttributes {
	@Test(dependsOnMethods = { "M3", "M2" })
	public void M1() {
		System.out.println("NAG");
		Reporter.log("Running M1 ", true);
	}

	@Test
	public void M2() {
		System.out.println("UMA");
	}

	@Test
	public void M3() {
		System.out.println("SAI");
	}

	///////////////////////

	@Test(groups = "Software")
	public void Infy() {
		System.out.println("Infosys");
	}

	@Test
	public void Techm() {
		System.out.println("Techm");
	}

	@Test(groups = "Software")
	public void Wipro() {
		System.out.println("Wipro");
	}
}
