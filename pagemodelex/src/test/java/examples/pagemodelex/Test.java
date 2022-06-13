package examples.pagemodelex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObjects.HomePage;
import pageObjects.LoginPage;

public class Test {

	@org.testng.annotations.Test
	public  void testing() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\manjunath k s\\Desktop\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.rediff.com/");
		
		HomePage home=new HomePage(dr);
		
		home.getSignIn().click();
		
		LoginPage lgpage=new LoginPage(dr);
		
		lgpage.getUsername().sendKeys("hello");
		lgpage.getPassword().sendKeys("hello");
		lgpage.getSigninBtn().click();
		
		Thread.sleep(5000);
		
		lgpage.getBackHome().click();
		
		Thread.sleep(5000);
		
		dr.close();
	}

}
