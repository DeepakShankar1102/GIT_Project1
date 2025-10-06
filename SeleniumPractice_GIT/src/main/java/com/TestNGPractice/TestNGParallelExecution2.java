package com.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelExecution2 
{
	
	public static WebDriver driver;
    
	@Test
	public void PostMan() 
    {
    	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.postman.com/login");
		System.out.println("PostMan Website");
		driver.close();
	}
	
	@Test
	public void demoblaze() 
    {
    	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
		System.out.println("Demoblaze Website");
		driver.close();
	}
}
