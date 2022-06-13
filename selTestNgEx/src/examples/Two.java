package examples;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Two {

	@BeforeSuite
	public void atBeginning()
	{
		System.out.println("This executed before the suit");
	}
	
	@Test
	public void third()
	{
		System.out.println("third method");
	}
	
	@Test
	public void fourth()
	{
		System.out.println("Fourth method");
	}
}
