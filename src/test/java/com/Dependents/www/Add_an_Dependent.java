package com.Dependents.www;

import java.io.IOException;
import java.time.Duration;

import org.testng.annotations.Test;

import pageObjectModels.DependentsPageObjects;
import resources.Base_Class;

public class Add_an_Dependent extends Base_Class {
	
	@Test
	public void a1() throws InterruptedException, IOException
	{
		driverInitialize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		launchURL();
		
		loginProcess();
		
		sectionSelect();
		
		DependentsPageObjects dpo = new DependentsPageObjects(driver);
		
		dpo.AddButton().click();
		
		dpo.NameTextfield().sendKeys("john");
		
		
		driver.close();
		
	}
}
