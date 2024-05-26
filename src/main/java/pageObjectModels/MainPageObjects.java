package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MainPageObjects {
	
	
	public WebDriver driver;
	
	
	
	// declaring the variables as private variables.
	
		private By myinfo = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
		
		private By dependents = By.xpath("//a[normalize-space()='Dependents']");
		
				
		
		
  // creating connection between BaseClass => Global var WebDriver & this class => WebDriver
		
		public MainPageObjects(WebDriver driver2)
		{
			this.driver = driver2;
		}

		

		
	// encapsulating the variables by using setter method
		
		public WebElement myInfoTab()
		{
			return driver.findElement(myinfo);
		}

		public WebElement dependentsTab()
		{
			return driver.findElement(dependents);
		}
		
		
}
