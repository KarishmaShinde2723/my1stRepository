package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
  @Test
  public void a() 
  {
	  Reporter.log("TC a is running", true);
	  }

	  @Test
	  public void b()
	  {
	  Assert.fail();
	  Reporter.log("TC b is running", true);
	  }

	  @Test(dependsOnMethods = {"b"})
	  public void c()
	  {
	  Reporter.log("TC c is running", true);
	  }

	  @Test
	  public void d()
	  {
	  Reporter.log("TC d is running", true);
	  }

}
