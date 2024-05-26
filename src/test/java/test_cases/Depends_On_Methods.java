package test_cases;

import org.testng.annotations.Test;

public class Depends_On_Methods {
	
	@Test
	public void driverInitialize()
	{
		System.out.println("Driver Initialized.");
	}

	@Test(dependsOnMethods = "driverInitialize")
	public void enterURL()
	{
		System.out.println("URL Opened.");
	}
	
}
