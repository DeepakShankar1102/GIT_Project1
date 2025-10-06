package com.TestNGPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGParallelExecution 
{
	
	public static WebDriver driver;
    
	@Test
	public void github() 
    {
    	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		System.out.println("GitHUb Website");
		driver.close();
	}
	
	@Test
	public void Flipkart() 
    {
    	WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		System.out.println("flipkart Website");
		driver.close();
	}
}
