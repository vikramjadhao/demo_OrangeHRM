package demo_Tests;

import org.testng.annotations.Test;

public class priorities_byNum {
	
	// the execution flow of method priorities with random will accordingly to smaller to greater numbers.
	
	@Test(priority = 1111)
	public void driverInitialize()
	{
		System.out.println("Driver Initialized.");
	}

	@Test(priority = 22)
	public void enterURL()
	{
		System.out.println("URL Opened.");
	}
	
	@Test(priority = 333)
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
