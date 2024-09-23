package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DependentsPageObjects {
	
	public WebDriver driver;
	
	
	private By AssignedDependent = By.xpath("//h6[normalize-space()='Assigned Dependents']");
	
	private By NameCheckbox = By.xpath("(//i[@class='oxd-icon bi-check oxd-checkbox-input-icon'])[1]");
	
	private By AddButton = By.xpath("(//button[@type='button'][normalize-space()='Add'])[1]");
	
	private By NameTextfield = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
	
	
	public DependentsPageObjects(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	
	
	public WebElement AssignedDependent()
	{
		return driver.findElement(AssignedDependent);
	}

	public WebElement NameCheckbox()
	{
		return driver.findElement(NameCheckbox);
	}
	
	public WebElement AddButton()
	{
		return driver.findElement(AddButton);
	}
	
	public WebElement NameTextfield()
	{
		return driver.findElement(NameTextfield);
	}
	
	
	
}
