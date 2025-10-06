package com.practice;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExceptionsSelenium {
	public static void main(String[] args) throws InterruptedException {
		
		ExceptionsSelenium exp=new ExceptionsSelenium();
		exp.Exp1();
		
	}
public static WebDriver driver;

public static void Exp1() {
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.postman.com/login");
	
	WebElement signin;
	try {
		signin = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[6]/div/div[4]/div[1]/a[1]/buttonsss"));
		signin.click();
	} catch (org.openqa.selenium.NoSuchElementException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println("NO such");
		System.err.println("No such elt");
		System.out.println(e);
		throw(e);
		
	
		
	}
	
	finally {
		driver.close();
	}
	
	
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


