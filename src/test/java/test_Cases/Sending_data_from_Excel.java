package test_Cases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import pageObjectModels.LoginPageObjects;
import resources.Base_Class;

public class Sending_data_from_Excel extends Base_Class{

	@Test
	public void sendData() throws FileNotFoundException,IOException, InterruptedException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\HP\\OneDrive\\Desktop\\SsquareIT\\demo.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		XSSFRow row = sheet.getRow(0);
		
		XSSFCell cell = row.getCell(0);
		
		String username = cell.toString();
		
		XSSFCell cell1 = row.getCell(1);
		
		String password = cell1.toString();
		
		driverInitialize();
		
		launchURL();
		
		LoginPageObjects lpo = new LoginPageObjects(driver);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		
		lpo.enterUsername().sendKeys(username);
		
		lpo.enterPassword().sendKeys(password);
		
		lpo.loginButton().click();
		
		
		driver.close();
		
	}
	
	
}
