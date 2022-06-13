package examples;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Four {

	@AfterTest
	public void afterTest()
	{
		System.out.println("After test");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before every method");
	}
	
	
	@Test
	public void seventh()
	{
		System.out.println("seventh");
	}
	@Test
	public void eigth()
	{
		System.out.println("eigth");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
}
