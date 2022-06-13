package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class GreenKartPage {

	WebDriver driver;

	public GreenKartPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBys(@FindBy(xpath = "//h4[@class='product-name']"))
	public List<WebElement> productNames;
	
	@FindBys(@FindBy(xpath = "//p[@class='product-price']"))
	public List<WebElement> productPrice;

	public List<WebElement> getProductNames() {
		return productNames;
	}

	public List<WebElement> getProductPrice() {
		return productPrice;
	}
	
	
	
	
	
}
