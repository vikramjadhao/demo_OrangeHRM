package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObjects {
	
	public WebDriver driver;
	
	
	private By username = By.xpath("//input[@name='username']");
	
	private By password = By.xpath("//input[@name='password']");
	
	private By login = By.xpath("//button[@type='submit']");
	
	
	
	public LoginPageObjects(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	
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
