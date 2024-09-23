package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObjects {
	
	
	public WebDriver driver;
	
	
	private By myInfo = By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a");
	
	private By dependents = By.xpath("//a[normalize-space()='Dependents']");
	
	
	public MainPageObjects(WebDriver driver2)
	{
		this.driver=driver2;
	}

	
	public WebElement myInfoTab()
	{
		return driver.findElement(myInfo);
	}
	
	public WebElement dependentsTab()
	{
		return driver.findElement(dependents);
	}
	

}
