package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	
	
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='login']")
	WebElement username;
	
	@FindBy(xpath = "//input[@name='passwd']")
	WebElement password;
	
	@FindBy(xpath = "//input[@name='proceed']")
	WebElement signinBtn;

	@FindBy(xpath = "//a[@class='f12']")
	WebElement backHome;
	
	
	
	public WebElement getBackHome() {
		return backHome;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}
	
	
	
}
