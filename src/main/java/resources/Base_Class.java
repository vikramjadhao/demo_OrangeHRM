package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import pageObjectModels.LoginPageObjects;
import pageObjectModels.MainPageObjects;

public class Base_Class {

	
	public static WebDriver driver;
	
	
	public void driverInitialize() throws InterruptedException, IOException	
	{
		
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\TestNG_Framework\\src\\main\\java\\resources\\data.properties"); 
		
		Properties p = new Properties();
		
		p.load(fis);
		
		String browserName = p.getProperty("browser");
		
		
		// using switch-case approach
		
		
		switch(browserName)
		{
			case "chrome":
				driver = new ChromeDriver();
				break;
				
			case "edge":
				driver = new EdgeDriver();
				break;
				
			case "firefox":
				driver = new FirefoxDriver();
				break;
		
			default:
			{
				System.out.println("Please check that you have selected the correct browser..!!");
			}
				
		}
		
		
		// using if-else approach
		
		
/*		if(browserName.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		else if(browserName.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
		else
		{
			System.out.println("Please check you have selected the correct browser..!!");
		}
				
*/		
		
	}
	
	public void launchURL() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	
	}
	
	
	public void loginProcess()
	{
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		lpo.enterUsername().sendKeys("Admin");
		
		lpo.enterPassword().sendKeys("admin123");
		
		lpo.loginButton().click();
		
		String expectedTitle = driver.getTitle();
		String actualTitle = "OrangeHRM";
		
		Assert.assertEquals(expectedTitle, actualTitle);
		
		System.out.println("You have log in successfully..!!");
		
		
/*		WebElement dashboardText = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
		
		Assert.assertTrue(dashboardText.isDisplayed());
		
		System.out.println("You have log in successfully..!!");
*/		
		
	}
	
	
	public void sectionSelect()
	{
		MainPageObjects mpo = new MainPageObjects(driver);
		
		WebDriverWait myWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		
		myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='oxd-main-menu-item active']")));
		mpo.myInfoTab().click();
		
		myWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Dependents']")));
		mpo.dependentsTab().click();
		
		WebElement dependentsTab = driver.findElement(By.xpath("//a[normalize-space()='Dependents']"));
		
		Assert.assertNotNull(dependentsTab.isSelected());
		
		System.out.println("You have selected the dependents section..!!");
		
	}
	
	
}
