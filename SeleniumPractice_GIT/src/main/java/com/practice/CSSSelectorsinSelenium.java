package com.practice;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorsinSelenium {
	public static void main(String[] args) {
		
		CSSSelectorsinSelenium exp=new CSSSelectorsinSelenium();
		exp.CSSMultiple();
		
	}
public static WebDriver driver;

public static void CSSID() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demoblaze.com/");
	
	WebElement signin;
	signin=driver.findElement(By.cssSelector("#login2"));
	signin.click();
	driver.close();
	
		
	}

public static void CSSClass() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demoblaze.com/");
	
	WebElement signin;
	signin=driver.findElement(By.cssSelector(".nav-link"));
	signin.click();
	driver.close();
	
		
	}

public static void CSSMultiple() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.demoblaze.com/");
	
	WebElement signin;
	signin=driver.findElement(By.cssSelector("a[class='nav-link'][id='login2']"));
	signin.click();
	driver.close();
	
		
	}
	
	
	
	


public static void Exp2() throws InterruptedException {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.postman.com/login");
	
	    WebElement signin;
	    Thread.sleep(60000);
		signin = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[6]/div/div[4]/div[1]/a[1]/buttonsss"));
		signin.click();

		
	}
	
	
	
}


