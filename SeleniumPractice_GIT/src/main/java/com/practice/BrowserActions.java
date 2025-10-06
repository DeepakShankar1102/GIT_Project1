package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserActions {
	public static WebDriver driver;
	public static void main(String[] args) {
		BrowserActions browser=new BrowserActions();
		browser.browserActions();

	}
	

	public void browserActions() {
		
		
		  ChromeOptions chrome=new ChromeOptions();
		  chrome.addArguments("--remote-allow-origins=*"); 
		  driver = new ChromeDriver(chrome); 
		  driver.manage().window().maximize();
		 
		  
		  driver.get("https://github.com/");// navigation
		  driver.navigate().to("https://github.com/");// navigation
		  driver.navigate().back();//To Navigate Back
		  driver.navigate().forward();//To Navigate Forward
		  driver.navigate().refresh();//To Refresh the Page
		  System.out.println( driver.getTitle()); 
	      System.out.println(  driver.getCurrentUrl());
		  System.out.println(  driver.getPageSource());
		  driver.close();//To close current browser
		  driver.quit();//To close All opened browser
		  
		  
		}

}
