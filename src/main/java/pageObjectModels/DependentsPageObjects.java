package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DependentsPageObjects {
	
	public WebDriver driver;
	
	
	private By assigned_Dependents = By.xpath("//h6[text()='Assigned Dependents']");
	
	private By add_Button = By.xpath("(//button[@type='button'][normalize-space()='Add'])[1]");
	
	
	
	
	public DependentsPageObjects(WebDriver driver2)
	{
		this.driver = driver2;
	}
	
	
	
	
	public WebElement assignDependents()
	{
		return driver.findElement(assigned_Dependents);
	}
	
	public WebElement addButton()
	{
		return driver.findElement(add_Button);
	}
	
	
	
	
	
	
}
