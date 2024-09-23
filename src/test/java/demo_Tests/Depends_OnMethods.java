package demo_Tests;

import org.testng.annotations.Test;

public class Depends_OnMethods {
	
	// firstly all normal @Test methods will run and then @Test with Depends_OnMethods will run. 
	
	@Test
	public void driverInitialize()
	{
		System.out.println("Driver Initialized..!!");
	}
	
	@Test(dependsOnMethods = "driverInitialize")
	public void enterURL()
	{
		System.out.println("URL Entered..!!");
	}
	
	@Test
	public void enterCredentials()
	{
		System.out.println("Credentials Entered..!!");
	}
	
	@Test(dependsOnMethods = "enterCredentials")
	public void driverClose()
	{
		System.out.println("Driver Closed..!!");
	}
	
	
}
