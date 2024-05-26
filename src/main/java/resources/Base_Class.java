package resources;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjectModels.DependentsPageObjects;
import pageObjectModels.LoginPageObjects;
import pageObjectModels.MainPageObjects;

public class Base_Class {
	
	// declaring WebDriver as a global variable
	
	public static WebDriver driver;
	
	
	
	public void driverInitialize() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	

	
	public void loginProcess()
	{
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		lpo.enterUsername().sendKeys("Admin");
		lpo.enterPassword().sendKeys("admin123");
		lpo.loginButton().click();
	}
	

	
	public void sectionSelect() throws InterruptedException
	{
		MainPageObjects mpo = new MainPageObjects(driver);
		
		mpo.myInfoTab().click();
		Thread.sleep(2000);
		
		mpo.dependentsTab().click();
		Thread.sleep(2000);
	}
	
	
	
	public void assigned_Dependents()
	{
		DependentsPageObjects dpo = new DependentsPageObjects(driver);
		
		System.out.println(dpo.assignDependents().getText());
	}
	
	
	public void add_Button()
	{
		DependentsPageObjects dpo = new DependentsPageObjects(driver);
		
		System.out.println(dpo.addButton().getText());
	}
	
	
	public void add_ButtonClick()
	{
		DependentsPageObjects dpo = new DependentsPageObjects(driver);
		
		dpo.addButton().click();
	}
}
