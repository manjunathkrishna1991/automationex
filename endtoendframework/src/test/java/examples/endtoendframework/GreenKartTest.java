package examples.endtoendframework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.GreenKartPage;
import resources.Base;

public class GreenKartTest extends Base{

	private static Logger log=LogManager.getLogger(GreenKartTest.class.getName());
	
	@Test(dataProvider = "getData")
	public void testVegitablePrice(String item)
	{
		log.info("Running Greenkart for the item"+item);
		getDriver();
		driver.get(p.getProperty("url1"));
		
		GreenKartPage gr=new GreenKartPage(driver);
		
		for(int i=0;i<gr.getProductNames().size();i++)
		{
			if(gr.getProductNames().get(i).getText().contains(item))
			{
				System.out.println(gr.getProductPrice().get(i).getText());
				
			}
			
		}
		
	}
	
	@DataProvider
	public Object[] getData()
	{
		Object[] data= {"Beans","Pears"};
				
				return data;
	}
	
	@AfterMethod
	public void closing()
	{
		driver.close();
	}
}
