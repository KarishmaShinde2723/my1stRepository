package TestNGRevision;

import org.testng.annotations.Test;

public class Suit {
	
	@Test(groups="Sanity")
	public void TC1()
	{
		System.out.println("TC1 is running");
	}
	
	@Test(groups="Sanity")
	public void TC2()
	{
		System.out.println("TC2 is running");
	}
	
	@Test(groups="Regression")
	public void TC3()
	{
		System.out.println("TC3 is running");
	}
	
	@Test(groups="Regression")
	public void TC4()
	{
		System.out.println("TC4 is running");
	}

}
