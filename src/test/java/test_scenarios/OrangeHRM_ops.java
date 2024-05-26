package test_scenarios;

import org.testng.annotations.Test;

import resources.Base_Class;

public class OrangeHRM_ops extends Base_Class {
	

	@Test(priority = 1)
	public void launchBrowser() throws InterruptedException
	{
		driverInitialize();
	    Thread.sleep(2000);  
	}
	
	
	
	@Test(priority = 2)
	public void userLogin() throws InterruptedException
	{
		loginProcess();
	    Thread.sleep(2000);
	}
	
	
	
	@Test(priority = 3)
	public void navigateToSection() throws InterruptedException
	{
		sectionSelect();
	    Thread.sleep(2000);
	}
	
	
	// To validate "Assigned Dependents" text is visible or not.
	
	@Test(priority = 4)
	public void assign_DepText()
	{
		assigned_Dependents();
	}
	
	
	
	// To validate " +Add" button text is visible or not.
	@Test(priority = 5)
	public void addButton_Text()
	{
		add_Button();
	}
	
	
	// To validate " +Add" button is clickable or not.
	@Test(priority = 6)
	public void addButton()
	{
		add_ButtonClick();
	}
	
	
	
}
