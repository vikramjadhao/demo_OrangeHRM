package test_cases;

import org.testng.annotations.Test;

public class Demo {

	// it will execute methods in alphabetical order
	// @Test annotation is compulsory to give to each method to execute it otherwise TestNG will skip it.
	
	@Test
	public void launchBrowser()
	{
		System.out.println("code to launching the browser...");
	}
	
	@Test										
	public void enterURL()
	{
		System.out.println("code to navigate to the URL...");
	}
	
}
