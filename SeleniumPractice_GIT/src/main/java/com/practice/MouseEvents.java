package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvents {
	
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MouseEvents ev=new MouseEvents();
		ev.Mouse9();
	}
	
	//1. Move to an Element (Hover)
	//Used to simulate mouse hovering over an element.
	public void Mouse1() throws InterruptedException
	{
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Ele= driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
		 
		 Actions act=new Actions(driver);
		 act.moveToElement(Ele).perform();
		 Thread.sleep(10000);
		 driver.close();
	}
	
	//2. Click
	//Normal left-click on an element.
	public void Mouse2() throws InterruptedException
	{
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Ele= driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]"));
		 
		 Actions act=new Actions(driver);
		 act.click(Ele).perform();
		 Thread.sleep(10000);
		 driver.close();
	}
	
	//3. Double Click
	//Double-clicking an element.
	public void Mouse3() throws InterruptedException
	{
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.flipkart.com/");
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement Ele= driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]"));
		 
		 Actions act=new Actions(driver);
		 act.doubleClick(Ele).perform();
		 Thread.sleep(10000);
		 driver.close();
	}

	    //4. Right Click (Context Click)
	    //Right-click on an element.
	 	public void Mouse4() throws InterruptedException
		{
			 driver =new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.flipkart.com/");
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement Ele= driver.findElement(By.xpath("//span[contains(text(),'Mobiles & Tablets')]"));
			 
			 Actions act=new Actions(driver);
			 act.contextClick(Ele).perform();
			 Thread.sleep(10000);
			 driver.close();
		}
	 	
	 //	5. Click and Hold
	 	//Click and hold the mouse button (without releasing).
	 	public void Mouse5() throws InterruptedException
		{
			 driver =new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.flipkart.com/");
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement Ele= driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
			 
			 Actions act=new Actions(driver);
			 act.clickAndHold(Ele).perform();
			 Thread.sleep(10000);
			 driver.close();
		}
	 	
	 	 //	6. Drag and Drop
		 //	using Click and Hold, Release
		 	public void Mouse6() throws InterruptedException
			{
				 driver =new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get("https://practice.expandtesting.com/drag-and-drop");
				 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement drag= driver.findElement(By.xpath("//*[@id='column-a']"));
				WebElement drop= driver.findElement(By.xpath("//*[@id='column-b']"));
				 
				 Actions act=new Actions(driver);
				 act.clickAndHold(drag).moveToElement(drop).release(drop).perform();
				 
				 
				 Thread.sleep(10000);
				 driver.close();
			}
	 	
	 //	7. Drag and Drop
	 //	Drag an element and drop it on another element.
	 	public void Mouse7() throws InterruptedException
		{
			 driver =new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://practice.expandtesting.com/drag-and-drop");
			 
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			WebElement drag= driver.findElement(By.xpath("//*[@id='column-a']"));
			WebElement drop= driver.findElement(By.xpath("//*[@id='column-b']"));
			 
			 Actions act=new Actions(driver);
			 act.dragAndDrop(drag, drop).build().perform();
			 Thread.sleep(10000);
			 driver.close();
		}
	 	
	 	
	 	 //	8. Drag and Drop By 
		 //	Drag an element and drop it on another element by using Offset
		 	public void Mouse8() throws InterruptedException
			{
				 driver =new ChromeDriver();
				 driver.manage().window().maximize();
				 driver.get("https://practice.expandtesting.com/drag-and-drop");
				 
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				WebElement drag= driver.findElement(By.xpath("//*[@id='column-a']"));
				WebElement drop= driver.findElement(By.xpath("//*[@id='column-b']"));
				 
				 Actions act=new Actions(driver);
			/*	 int X=drag.getLocation().getX();
				 int Y=drag.getLocation().getY();
				 act.dragAndDropBy(drag, X+2,Y+2).build().perform();*/
				 
				 act.dragAndDropBy(drag, 30,45).build().perform();
				 Thread.sleep(10000);
				 driver.close();
			}
		 	
		 	//9. Move by Offset

		 	//Move the mouse to specific x/y coordinates relative to current position.
			 	public void Mouse9() throws InterruptedException
				{
					 driver =new ChromeDriver();
					 driver.manage().window().maximize();
					 driver.get("https://practice.expandtesting.com/drag-and-drop");
					 
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					WebElement drag= driver.findElement(By.xpath("//*[@id='column-a']"));
					WebElement drop= driver.findElement(By.xpath("//*[@id='column-b']"));
					 
					 Actions act=new Actions(driver);
				
					 act.moveByOffset(100,50).build().perform();
					 Thread.sleep(10000);
					 driver.close();
				}
	 	

}
