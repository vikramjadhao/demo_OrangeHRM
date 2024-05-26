package test_cases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageObjectModels.LoginPageObjects_CBT;
import resources.Base_Class_CBT;

public class Verify_Login_CBT extends Base_Class_CBT {
	
	@Test
	public void verifyLoginProcess() throws InterruptedException, IOException
	{
		
		driverInitialize();
		
		Thread.sleep(2000);
		
		
		
		// creating object of LoginPageObjects_CBT class
		
		LoginPageObjects_CBT lpo = new LoginPageObjects_CBT(driver);
		
		
		
		// getting setter methods by using setter method
		
		lpo.enterUsername().sendKeys("Admin");
		Thread.sleep(2000);
		
		lpo.enterPassword().sendKeys("admin123");
		Thread.sleep(2000);
		
		lpo.loginButton().click();
		Thread.sleep(2000);
		
	}

}
