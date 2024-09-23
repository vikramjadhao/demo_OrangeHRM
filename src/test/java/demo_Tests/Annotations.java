package demo_Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations {
	
	@Test
	public void a1()
	{
		System.out.println("      ==> @Test Method a1");
	}
	
	@Test
	public void a2()
	{
		System.out.println("      ==> @Test Method a2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("   ==> @BeforeMethod");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("   ==> @AfterMethod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println(" ==> @BeforeClass");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println(" ==> @AfterClass");
	}
	

}
