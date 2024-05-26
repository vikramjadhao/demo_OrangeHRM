package test_cases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void m1()
	{
		System.out.println("==> @Test method m1.");
	}
	
	@Test
	public void m2()
	{
		System.out.println("==> @Test method m2.");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("=> @BeforeMethod");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("=> @AfterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("@BeforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("@AfterClass");
	}
	
	
}



