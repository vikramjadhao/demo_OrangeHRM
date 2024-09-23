package demo_Tests;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled = true)
	public void driverInitialize()
	{
		System.out.println("Driver Initialized..!!");
	}
	
	@Test(enabled = false)
	public void enterURL()
	{
		System.out.println("URL Entered..!!");
	}
	
	@Test(priority = 4)
	public void driverClose()
	{
		System.out.println("Driver Closed..!!");
	}
	

}
