package com.devtools;

import java.util.Optional;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.emulation.Emulation;
import org.testng.annotations.Test;

public class Example1 {

	@Test
	public void heightAdjust()
	{
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.google.com");
		
		DevTools tool = dr.getDevTools();
		tool.createSession();
		tool.send(Emulation.setDeviceMetricsOverride(600, 1000, 50, false, Optional.empty(), Optional.empty()
				, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(),
				Optional.empty(), Optional.empty()));
		
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		dr.close();
	}
}
