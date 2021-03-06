package com.devtools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.fetch.Fetch;
import org.testng.annotations.Test;

public class ProcessingRequest {

	@Test
	public void changeRequest()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		
		DevTools tool = dr.getDevTools();
		tool.createSession();
		tool.send(Fetch.enable(Optional.empty(),Optional.empty()));
		tool.addListener(Fetch.requestPaused(),request->{
			
			if(request.getRequest().getUrl().contains("shetty")) {
				
				String newUrl=request.getRequest().getUrl().replace("shetty", "BadGuy");
				
				tool.send(Fetch.continueRequest(request.getRequestId(), Optional.of(newUrl)
						, Optional.of(request.getRequest().getMethod()),Optional.empty() , Optional.empty()
						, Optional.empty()));
				
			}
		});
		dr.get("https://rahulshettyacademy.com/angularAppdemo/");
		dr.findElement(By.xpath("//button[@routerlink='/library']")).click();
	}
}
