package listeners;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest2 {
  @Test
  public void  w()
  {
	  Reporter.log("TC w is running", true);
	  }

	  @Test
	  public void x()
	  {
	  Assert.fail();
	  Reporter.log("TC x is running", true);
	  }

	  @Test(dependsOnMethods = {"x"})
	  public void y()
	  {
	  Reporter.log("TC y is running", true);
	  }

	  @Test
	  public void z()
	  {
	  Reporter.log("TC z is running", true);
	  }

}
