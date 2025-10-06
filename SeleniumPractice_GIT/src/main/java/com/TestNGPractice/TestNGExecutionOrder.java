package com.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExecutionOrder {
	public static WebDriver driver;
	
	@BeforeTest
	public void Launching() {
		
		ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		
		
		
	}
	
	@Test
	public void URL()
	{
		 driver.get("https://github.com/");
	}
	
	

	@AfterTest
	public void ClosingBrowser() {
		
		 driver.close();
		
	}
	
	

}
