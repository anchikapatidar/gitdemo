package Resources;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners extends BaseTest implements ITestListener{

	public void onTestStart(ITestResult result)
	{
		extentReport.test=extentReport.extent.createTest(result.getMethod().getMethodName());
	}
	
	public void onTestSuccess()
	{
		extentReport.test.pass("Test passed");
	}
	
	public void onTestFailure()
	{
		extentReport.test.fail("Test failed");
	}
}
