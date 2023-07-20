package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener  {
	
	public void onTestSuccess(ITestResult Result)
	{
		Reporter.log("TC"+ Result.getName()+"is passed", true);
	}
	
	public void onTestFailure(ITestResult Result)
	{
		Reporter.log("TC"+Result.getName()+"is Failed", true);
	}
	
	public void onTestSkipped(ITestResult Result)
	{
		Reporter.log("TC" +Result.getName()+"is Skipped Plz Check TC", true);
	}
	
	

}
