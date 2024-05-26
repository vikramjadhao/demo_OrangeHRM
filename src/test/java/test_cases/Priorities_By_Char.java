package test_cases;

import org.testng.annotations.Test;

public class Priorities_By_Char {
	
	// the execution flow of method priorities with characters will accordingly by their ASCII values, smaller to greater.
	
	@Test(priority = 'A')
	public void driverInitialize()
	{
		System.out.println("Driver Initialized.");
	}

	@Test(priority = 'a')
	public void enterURL()
	{
		System.out.println("URL Opened.");
	}
	
	@Test(priority = 'V')
	public void enterCredentials()
	{
		System.out.println("Crendentials Entered.");
	}
	
	@Test(priority = 'v')
	public void driverClose()
	{
		System.out.println("Driver Closed.");
	}
}
