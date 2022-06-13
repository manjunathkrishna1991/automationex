package examples.endtoendframework;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import resources.Base;

public class TestMain extends Base{

	WebDriver driver;
	private static Logger log=LogManager.getLogger(TestMain.class.getName());
	@Test(dataProvider = "getDataProvider")
	public void loginPageTest(String user,String password,String status)
	{
		driver=getDriver();
		log.info("Driver object taken");
		driver.get(p.getProperty("url"));
		driver.manage().window().maximize();
		log.info("Site loaded");
		HomePage home=new HomePage(driver);
		
		home.getClosing().click();
		home.getLogin().click();
		
		LoginPage login=new LoginPage(driver);
		log.info("Login page reached");
		
		if(status.equals("Not Restricted")) {
		login.getEmail().sendKeys(user);
		login.getPassword().sendKeys(password);
		login.getSubmit().click();
		log.info("Login attempt done");
		}
		else
		{
			login.getEmail().sendKeys(user);
			login.getPassword().sendKeys(password);
			login.getSubmit().click();
			Assert.assertTrue(false);
		}
	}
	
	@DataProvider
	public Object[][] getDataProvider()
	{
		Object[][] data=new Object[2][3];
	
		data[0][0]="manju";
		data[0][1]="manju@123";
		data[0][2]="Not Restricted";
		log.info("one student done");
		
		data[1][0]="manjunath";
		data[1][1]="manju@123";
		data[1][2]="Restricted";
		log.info("Second student completed");
		
		return data;
	}
		
	@AfterTest
	public void closing()
	{
		log.info("closing the browser");
		driver.quit();
	}
}
