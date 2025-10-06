package com.pageobjectTestcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.pageobjectPages.LoginPage2;

public class LoginTestcase2 {
	
	public static RemoteWebDriver driver;
	@Test
	public void Login() throws InterruptedException 
	{
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(10000);
		 
		
		 LoginPage2.Username(driver).sendKeys("Admin");
		 LoginPage2.Password(driver).sendKeys("Admin123");
		 LoginPage2.Login(driver).click();
		 driver.close();
		
	}
	
	//Method 2: This is just calling object from other class and calling those methods. Not widely used
	  //          Only difference is not creating object
	

}
