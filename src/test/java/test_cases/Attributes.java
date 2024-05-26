package test_cases;

import org.testng.annotations.Test;

public class Attributes {
	
	@Test(priority = 0)
	public void driverInitialize()
	{
		System.out.println("Driver Initialized.");
	}

	@Test(priority = 1, enabled = false, dependsOnMethods = "driverInitialize")
	public void enterURL()
	{
		System.out.println("URL Opened.");
	}
	
	@Test(priority = 2, dependsOnMethods = "enterURL", enabled = false)
	public void maximizeWindow()
	{
		System.out.println("Window Maximized.");
	}
	
	@Test(dependsOnMethods = "maximizeWindow", enabled = false, priority = 3)
	public void enterCredentials()
	{	 
		
		System.out.println("Crendentials Entered.");
	}
	
	@Test(priority = 4)
	public void driverClose()
	{
		System.out.println("Driver Closed.");
	}

}
