package demo_Tests;

import org.testng.annotations.Test;

public class All_Attributes {

	@Test(priority = 0)
	public void driverInitialize()
	{
		System.out.println("Driver Initialized..!!");
	}
	
	@Test(priority = 1, enabled = false, dependsOnMethods = "driverInitialize")
	public void enterURL()
	{
		System.out.println("URL Entered..!!");
	}
	
	@Test(enabled = false, priority = 2, dependsOnMethods = "enterURL")
	public void enterCredentials()
	{
		System.out.println("Credentials Entered..!!");
	}
	
	@Test(dependsOnMethods = "enterCredentials", priority = 3, enabled = false)
	public void clickLogin() 
	{
		System.out.println("Login Button Clicked..!!");
	}
	
	@Test(priority = 4)
	public void driverClose()
	{
		System.out.println("Driver Closed..!!");
	}
	
	
}


