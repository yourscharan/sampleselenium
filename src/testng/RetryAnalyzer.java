package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int retryLimit = 3;

	@Override
	public boolean retry(ITestResult arg0) {
		// TODO Auto-generated method stub
		if (count < retryLimit) {
			count++;
			return true;
		}
		return false;
	}

}
