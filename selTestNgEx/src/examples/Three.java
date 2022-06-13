package examples;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Three {

	@AfterSuite
	public void atTheEnd()
	{
		System.out.println("At the end of the suit");
	}
	
	@Test
	public void fifth()
	{
		System.out.println("Fifth");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before test executed");
	}
	
	@Test
	public void sixth()
	{
		System.out.println("Sixth");
	}
}
