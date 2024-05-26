package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Class_CBT {
	
	// declaring WebDriver as a global variable
	
	public static WebDriver driver;
	
	
	public void driverInitialize() throws InterruptedException, IOException
	{
		
		// to deal with the file
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\TestNG_Framework\\src\\main\\java\\resources\\data.properties");   
		
		
		Properties prop = new Properties();
		
		// to load the file
		prop.load(fis);
		
		// to get the value present in-front of the string from the file
		prop.getProperty("browser");
		
		String browserName = prop.getProperty("browser");
		
		
	
		if (browserName.equalsIgnoreCase("chrome"))
		{
			
			driver = new ChromeDriver();
		
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		
		
		else if (browserName.equalsIgnoreCase("firefox"))
		{
			
			driver = new FirefoxDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		
		
		else if (browserName.equalsIgnoreCase("edge"))
		{
			
		    driver = new EdgeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			Thread.sleep(2000);	
		}
		
		
		else
		{
			System.out.println("Please check you have selected the correct browser.");
		}
		
		
		
	}
	

}
