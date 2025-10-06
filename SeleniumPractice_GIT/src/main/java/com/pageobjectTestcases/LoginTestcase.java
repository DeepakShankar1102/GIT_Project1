package com.pageobjectTestcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobjectPages.LoginPage;

public class LoginTestcase {
	
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
		 
		 PageFactory.initElements(driver, LoginPage.class);
		 LoginPage.Uname.sendKeys("Admin");
		 LoginPage.Password.sendKeys("Admin123");
		 LoginPage.Login.click();
		 driver.close();
		
	}

}
