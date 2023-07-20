package TestNGRevision;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBTest {
  @Test(dataProvider="MyFBData", dataProviderClass=TestNGRevision.MyDataProvider.class)
  public void fBLogin(String userName, String password) 
  {
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://www.facebook.com/login/");
	  driver.findElement(By.id("email")).sendKeys(userName);
	  driver.findElement(By.id("pass")).sendKeys(password);
	  
  }
}
