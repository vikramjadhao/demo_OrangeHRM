package test_Cases;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModels.LoginPageObjects;
import resources.Base_Class;

public class VerifyLogin extends Base_Class{
	
	
	@Test
	public void verifyLoginSteps() throws InterruptedException, IOException
	{
		driverInitialize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		launchURL();
		
		loginProcess();
		
		
		// driver.close();
		
	}
	

	
	
}
