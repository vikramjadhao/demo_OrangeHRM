package test_cases;

import org.testng.annotations.Test;

public class Priorities {
	
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
	
	@Test(priority = 2)
	public void enterCredentials()
	{
		System.out.println("Crendentials Entered.");
	}
	
	@Test(priority = 3)
	public void driverClose()
	{
		System.out.println("Driver Closed.");
	}
	
}
