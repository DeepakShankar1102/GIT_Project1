package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser_launchExtReport {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		Browser_launchExtReport browser=new Browser_launchExtReport();
	//	browser.EdgeLaunch();
		//browser.ChromeLaunch();
		browser.ChromeLaunchDirectly();
	//	browser.EdgeLaunchDirectly();
		
	}
	
	//To Launch Edge Driver Locally
	public void EdgeLaunch() {
		
       System.setProperty("webdriver.edge.driver", "C:\\Users\\msdee\\eclipse-workspace\\SeleniumPractice\\src\\main\\resources\\Drivers\\msedgedriver.exe");
		
		
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.close();
		
	}
	
	//To Launch Chrome Driver Locally
	public void ChromeLaunch() {
		
	       System.setProperty("webdriver.chrome.driver", "C:\\Users\\msdee\\eclipse-workspace\\SeleniumPractice\\src\\main\\resources\\Drivers\\chromedriver.exe");
	      
			
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://github.com/");
			driver.close();
		}
	
	public void ChromeLaunchDirectly() {
		
		/* Method 1
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		driver.close();*/
		
		//Create Extend Report
		  ExtentSparkReporter spark = new ExtentSparkReporter("ExtentReport.html");
          ExtentReports extent = new ExtentReports();
          extent.attachReporter(spark);
          ExtentTest test2 = extent.createTest("Search Test");
          
		  ChromeOptions chrome=new ChromeOptions();//ChromeOptions is a class in Selenium that lets you set special configuration options for the Chrome browser before launching it.You use it when you want to customize how Chrome should behave during automation (like disabling notifications, running in headless mode, setting user profiles, etc.).
		  chrome.addArguments("--remote-allow-origins=*"); //"--remote-allow-origins=*" is an argument that tells Chrome to allow all cross-origin requests from remote connections.This is often required because newer ChromeDriver + Chrome versions (v111+) started enforcing stricter origin checks, which sometimes caused errors like:
		  driver = new ChromeDriver(chrome); 
		  driver.manage().window().maximize();
		  driver.get("https://github.com/");
		  driver.close();
		  test2.pass("Test Passed");
		  extent.flush();
		}
	
	public void EdgeLaunchDirectly() {	
			
			driver= new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://github.com/");
			driver.close();
			
		}
		

}
