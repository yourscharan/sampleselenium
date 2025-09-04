package testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITESTLISTENER implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("This is onFinish method " + context.getPassedTests());
		System.out.println("This is onFinish method " + context.getFailedTests());

	}

	@Override
	public void onStart(ITestContext context) {

		System.out.println("This is onStart method " + context.getOutputDirectory());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Failed but within success percentage " + result.getName());
	}

//	@Override
//	public void onTestFailedWithTimeout(ITestResult result) {
//		// TODO Auto-generated method stub
//		ITestListener.super.onTestFailedWithTimeout(result);
//	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skipped " + result.getName());
	}

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("New Test Started " + result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Successfully Finished " + result.getName());
	}

}
