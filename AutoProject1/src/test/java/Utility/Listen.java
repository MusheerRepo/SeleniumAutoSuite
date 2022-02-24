package Utility;

import org.testng.ITestListener;
import org.testng.ITestResult;
import Framework.Setup;
public class Listen implements ITestListener
{
	public void onTestFailure(ITestResult result)
	{
	    System.out.println("Scenario failed");
	}
}
