package com.pageobjectTestcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.pageobjectPages.LoginPage1;

public class LoginTestcase1 {
	
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
		 
		 LoginPage1 POM= new LoginPage1();
		 POM.Username(driver).sendKeys("Admin");
		 POM.Password(driver).sendKeys("Admin123");
		 POM.Login(driver).click();
		 driver.close();
		
	}
	
	//Method 1: This is just calling object from other class and calling those methods. Not widely used
	

}
