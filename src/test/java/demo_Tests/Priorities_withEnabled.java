package demo_Tests;

import org.testng.annotations.Test;

public class Priorities_withEnabled {

	@Test(priority = 0, enabled = true)
	public void driverInitialize()
	{
		System.out.println("Driver Initialized..!!");
	}
	
	@Test(priority = 1)
	public void enterURL()
	{
		System.out.println("URL Entered..!!");
	}
	
	@Test(priority = 2, enabled = false)
	public void enterCredentials()
	{
		System.out.println("Credentials Entered..!!");
	}
	
	@Test(priority = 3, enabled = false)
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

