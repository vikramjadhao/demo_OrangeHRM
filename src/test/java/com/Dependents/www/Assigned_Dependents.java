package com.Dependents.www;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageObjectModels.DependentsPageObjects;
import pageObjectModels.MainPageObjects;
import resources.Base_Class;
import test_Cases.VerifyLogin;

public class Assigned_Dependents extends Base_Class{

	@Test
	public void a1() throws InterruptedException, IOException
	{
		driverInitialize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		launchURL();
		
		loginProcess();
		
		sectionSelect();
		
		DependentsPageObjects dpo = new DependentsPageObjects(driver);
		
		// to validate the AssignedDependent Text
		
		String expectedText = dpo.AssignedDependent().getText();
		String actualText = "Assigned Dependents";
		
		Assert.assertEquals(expectedText, actualText);
		
		
		// to validate the name checkbox
		
		dpo.NameCheckbox().click();
		
		Assert.assertTrue(dpo.NameCheckbox().isEnabled());
		
		 
		driver.close();
		
	}
	
}
