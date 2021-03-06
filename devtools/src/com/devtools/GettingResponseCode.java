package com.devtools;

import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v102.network.Network;
import org.testng.annotations.Test;

public class GettingResponseCode {

	@Test
		public void getResponse()
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\chromedriver.exe");
			
			ChromeDriver dr=new ChromeDriver();
			
			DevTools tool = dr.getDevTools();
			tool.createSession();
			
			tool.addListener(Network.requestWillBeSent(), request->{
				System.out.println(request.getRequest().getUrl());
			});
			
			tool.send(Network.enable(Optional.empty(), Optional.empty(), Optional.empty()));
			
			tool.addListener(Network.responseReceived(), response->{
				System.out.println(response.getResponse().getStatus());
				
			});
			
			dr.get("https://rahulshettyacademy.com/angularAppdemo/");
			dr.findElement(By.xpath("//button[@routerlink='/library']")).click();
		}
}
