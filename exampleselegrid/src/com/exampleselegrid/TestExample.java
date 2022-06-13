package com.exampleselegrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestExample {
	
	@Test
	public void googleTest()
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		try {
			WebDriver dr=new RemoteWebDriver(new URL("http://192.168.1.15:4444"),cap);
			
			dr.get("http://www.google.com");
			dr.findElement(By.xpath("//input[@name='q']")).sendKeys("manjunath k s");
			dr.findElement(By.xpath("//span[@class='QCzoEc z1asCe MZy1Rb']")).click();
			Thread.sleep(3000);
			dr.close();
			
			
			
			
		} catch (MalformedURLException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
