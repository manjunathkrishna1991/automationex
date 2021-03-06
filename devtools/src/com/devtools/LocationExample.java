package com.devtools;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.testng.annotations.Test;

public class LocationExample {

	@Test
	public void location()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
		
		ChromeDriver dr=new ChromeDriver();
		
		DevTools tool=dr.getDevTools();
		
		tool.createSession();
		
		Map<String,Object> location=new HashMap<>() ;
			 location.put("latitude",40);
			 location. put("longitude",3);
			 location.  put("accuracy",1);
			
		
		dr.executeCdpCommand("Emulation.setGeolocationOverride", location);
		dr.get("https://www.google.com");
		
		dr.findElement(By.name("q")).sendKeys("wikipedia",Keys.ENTER);
		
		dr.findElements(By.cssSelector("h3[class*='LC20lb']")).get(0).click();
		
		System.out.println(dr.getTitle());
		
		
		
	}
}
