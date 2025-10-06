package com.practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {
	
	public static WebDriver driver;

	public static void main(String[] args) {
	 
		windowHandling W=new windowHandling();
		W.window1();
  
	}
	
	public void window1()
	{
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/window");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement E1= driver.findElement(By.xpath("//*[@class=\"button is-info\"]"));
		 E1.click();
	
		 //Captured Old Window
		 String Oldwindow=driver.getWindowHandle();
		 System.out.println("Window "+Oldwindow);
		 
		 //To move the control to New Window
		Set<String> Handle =driver.getWindowHandles();
		for(String allwindow : Handle)
		{
			if(!allwindow.equals(Oldwindow))
			{
		driver.switchTo().window(allwindow);
		System.out.println((driver.getCurrentUrl()));
		driver.close();
			}
		}
		//Switching Back to Old window
		driver.switchTo().window(Oldwindow);
		System.out.println((driver.getCurrentUrl()));
		driver.close();
		
		 
	}

}
