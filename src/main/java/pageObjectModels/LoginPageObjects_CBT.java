package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects_CBT {
	
	public WebDriver driver;
	
	
	// declaring the variables as private variables.
	
	private By username = By.name("username");
	
	private By password = By.name("password");
	
	private By login = By.xpath("//button[@type='submit']");
	

	
	// creating connection between BaseClass_CBT => Global var WebDriver & this class => WebDriver
	
	public LoginPageObjects_CBT(WebDriver driver2)
	{
		this.driver=driver2;
	}
	
	 
	
	// encapsulating the variables by using setter method

	public WebElement enterUsername()
	{
		return driver.findElement(username);
	}
	
	public WebElement enterPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginButton()
	{
		return driver.findElement(login);
	}
	
	
	
}
