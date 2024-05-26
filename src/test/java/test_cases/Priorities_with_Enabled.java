package test_cases;

import org.testng.annotations.Test;

public class Priorities_with_Enabled {
	
	@Test(priority = 0)
	public void driverInitialize()
	{
		System.out.println("Driver Initialized.");
	}

	@Test(priority = 1)
	public void enterURL()
	{
		System.out.println("URL Opened.");
	}
	
	@Test(priority = 2, enabled = false)
	public void maximizeWindow()
	{
		System.out.println("Window Maximized.");
	}
	
	@Test(priority = 3, enabled = false)
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
