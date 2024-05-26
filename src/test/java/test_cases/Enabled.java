package test_cases;

import org.testng.annotations.Test;

public class Enabled {
	
	@Test(enabled = true)
	public void driverInitialize()
	{
		System.out.println("Driver Initialized.");
	}

	@Test
	public void enterURL()
	{
		System.out.println("URL Opened.");
	}
	
	@Test(enabled = false)
	public void enterCredentials()
	{
		System.out.println("Crendentials Entered.");
	}
	
	@Test
	public void driverClose()
	{
		System.out.println("Driver Closed.");
	}

}
