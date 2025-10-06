package com.pageobjectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage1 {
	
	
	
	
	public WebElement Username(WebDriver driver) 
	{
		
		return driver.findElement(By.name("username"));
	}
	
	public WebElement Password(WebDriver driver)
	{
		return driver.findElement(By.name("password"));
	}
	
	public WebElement Login(WebDriver driver)
	{
		return driver.findElement(By.xpath("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]"));
	}
	

}
