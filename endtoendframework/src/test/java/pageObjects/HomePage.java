package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;
	
	
	
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



	@FindBy(xpath = "//span[text()='Login']")
	WebElement login;

	@FindBy(xpath = "//button[text()='NO THANKS']")
	WebElement closing;
	public WebElement getLogin() {
		return login;
	}
	public WebElement getClosing() {
		return closing;
	}
	
	
	
	
}
