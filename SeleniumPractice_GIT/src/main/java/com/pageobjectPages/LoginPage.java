package com.pageobjectPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name="username")
	public static WebElement Uname;
	
	@FindBy(name="password")
	public static WebElement Password;
	
	@FindBy(xpath="//button[contains(@class,'oxd-button oxd-button--medium oxd-button--main orangehrm-login-button')]")
	public static WebElement Login;
	

}
