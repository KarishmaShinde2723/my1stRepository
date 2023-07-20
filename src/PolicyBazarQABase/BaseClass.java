package PolicyBazarQABase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import PolicyBazarQAUtility.Utility;

public class BaseClass {
	
	WebDriver driver;
	
	public void launchBrowser() throws InterruptedException
	{
		driver=new ChromeDriver();
		Reporter.log("Launching Browser", true);
		driver.get("https://www.policybazaar.com/");
		Utility.waitTime(1000);
		driver.manage().window().maximize();
		
	}
	
	public void closeBrowser() throws InterruptedException
	{
		driver.quit();
		Utility.waitTime(1000);
	}

}
