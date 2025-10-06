package com.practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class alertActions {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		alertActions acc=new alertActions();
		
		acc.simpleAlert();
		acc.confirmAlert();
		acc.promptAlert();

	}
	
	public void simpleAlert() throws InterruptedException {
		
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/alert");
		
		 
		 WebElement AlertBtn= driver.findElement(By.xpath("//*[contains(text(),'Simple Alert')]"));
		 AlertBtn.click();
		 Alert alert=driver.switchTo().alert();
		 alert.accept();
		 Thread.sleep(3000);//3 Seconds
		 driver.close(); 
		
	}
	public void confirmAlert() throws InterruptedException {
		
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/alert");
		
		 
		 WebElement AlertBtn1= driver.findElement(By.xpath("//*[contains(text(),'Confirm Alert')]"));
		 AlertBtn1.click();
		 Alert alert1=driver.switchTo().alert();
		System.out.println(alert1.getText()); 
		 alert1.accept();
		 Thread.sleep(3000);//3 Seconds
		 WebElement AlertBtn2= driver.findElement(By.xpath("//*[contains(text(),'Confirm Alert')]"));
		 AlertBtn2.click();
		 Alert alert2=driver.switchTo().alert();
		 alert2.dismiss();
		 
		 
		 Thread.sleep(3000);//3 Seconds
		 driver.close(); 
		
	}
	
	public void promptAlert() throws InterruptedException {
		
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/alert");
		
		 
		 WebElement AlertBtn= driver.findElement(By.xpath("//*[contains(text(),'Prompt Alert')]"));
		 AlertBtn.click();
		 Alert alert=driver.switchTo().alert();
		 alert.sendKeys("Name 1");
		 Thread.sleep(3000);//3 Seconds
		 alert.accept();
		 Thread.sleep(3000);//3 Seconds
		 driver.close(); 
		
	}
	
	
	/*Notes
	1.UnhandledAlert-  Doing actions other than alerts
	2.No Such Alert - giving alert conditions before alert*/

}
