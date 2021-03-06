package com.example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.testng.annotations.Test;

public class TestEx {
	
	@Test
	public void demo()
	{
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\src\\chromedriver.exe");
		
		WebDriver dr=new ChromeDriver();
		
		dr.get("https://rahulshettyacademy.com/angularAppdemo/");
		dr.findElement(By.linkText("Browse Products")).click();
		dr.findElement(By.linkText("Selenium")).click();
		dr.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		dr.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		dr.findElement(By.linkText("Appium")).click();
		dr.findElement(By.xpath("//button[text()='Add to Cart']")).click();
		dr.findElement(By.xpath("//button[text()='Continue Shopping']")).click();
		
		dr.findElement(By.linkText("Cart")).click();

		dr.findElements(By.xpath("//input[@id='exampleInputEmail1']")).get(0).clear();
		dr.findElements(By.xpath("//input[@id='exampleInputEmail1']")).get(1).clear();
		dr.findElements(By.xpath("//input[@id='exampleInputEmail1']")).get(0).sendKeys("2");
		dr.findElements(By.xpath("//input[@id='exampleInputEmail1']")).get(1).sendKeys("2");
		LogEntries entry = dr.manage().logs().get(LogType.BROWSER);
		List<LogEntry> logs = entry.getAll();
		
		for(LogEntry e:logs)
		{
			System.out.println(e.getMessage());
		}
		
		
	}
}
