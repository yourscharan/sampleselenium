package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Exp1 {
	@Test(retryAnalyzer = testng.RetryAnalyzer.class)
	public void Test1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void Test2() {
		Assert.assertEquals(true, true);
	}

}
