package stepDevelopments;



import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDevelopment {
	 WebDriver dr;
			
		  @Given("^User is on google page$") public void user_is_on_google_page() {
		  System.setProperty("webdriver.chrome.driver",
		  "C:\\Users\\manjunath k s\\Desktop\\chromedriver.exe"); dr=new
		  ChromeDriver(); dr.get("http://www.google.com");
		  
		  
		  }
		  
		  @When("^User search for (.+) in the search box$") 
		  public void
		  user_search_for_in_the_search_box(String string) {
		  dr.findElement(By.name("q")).sendKeys(string,Keys.ENTER);
		  
		  }
		  
		  @Then("visit first link") public void visit_first_link() {
		  dr.findElements(By.cssSelector("h3[class*='LC20lb']")).get(0).click();
		  
		  }
		 




}
