package com.pageobjectTestcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pageobjectPages.LoginPage;

public class LoginTestcase3 {
	
	public static RemoteWebDriver driver;
	
	public WebElement username;
	public WebElement password;
	
	@Test
	public void Login() throws InterruptedException 
	{
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 Thread.sleep(5000);
		 
		 PageFactory.initElements(driver, LoginTestcase3.class);
		 username.sendKeys("Admin");
		 password.sendKeys("Admin123");
		
		 driver.close();
		
	}
	
	// Without using @FindBy & driver.findby, Not widely used.
	

}
