package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFrames {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		SeleniumFrames Fr= new SeleniumFrames();
		Fr.Frame4();
		

	}	
	public void Frame0() {// using Frame Index
		
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/frame");
		 
		 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame(0);// Into Frame 0
		WebElement FirstName= driver.findElement(By.name("fname"));
		WebElement lastName= driver.findElement(By.name("lname"));
		FirstName.sendKeys("DEEPAK");
		lastName.sendKeys("SHANKAR");
		
		driver.switchTo().frame(0);//Inside that we are in Frame(0)
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("deepak@gmail.com");
		driver.close();
		
	}
	
	public void Frame1() {//Using Frame Name or ID
		
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/frame");
		 
		 
	
		driver.switchTo().frame("firstFr");
		WebElement FirstName= driver.findElement(By.name("fname"));
		WebElement lastName= driver.findElement(By.name("lname"));
		FirstName.sendKeys("DEEPAK");
		lastName.sendKeys("SHANKAR");
		
	
		
		driver.switchTo().frame(0);//Inside that we are in Frame(0)
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("deepak@gmail.com");
		driver.close();
		
	}
	
	public void Frame2() {//Using Frame Xpath
		
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/frame");
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		WebElement FrameXpath= driver.findElement(By.xpath("//iframe[@id=\"firstFr\"]"));
		driver.switchTo().frame(FrameXpath);
		WebElement FirstName= driver.findElement(By.name("fname"));
		WebElement lastName= driver.findElement(By.name("lname"));
		FirstName.sendKeys("DEEPAK");
		lastName.sendKeys("SHANKAR");
		
	
		
		driver.switchTo().frame(0);//Inside that we are in Frame(0)
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("deepak@gmail.com");
		driver.close();
		
	}
	
	public void Frame3() { //Using ParentFrame- One frame down
		
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/frame");
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		WebElement FrameXpath= driver.findElement(By.xpath("//iframe[@id=\"firstFr\"]"));
		driver.switchTo().frame(FrameXpath);
		WebElement FirstName= driver.findElement(By.name("fname"));
		WebElement lastName= driver.findElement(By.name("lname"));
		FirstName.sendKeys("DEEPAK");
		lastName.sendKeys("SHANKAR");
		
	
		
		driver.switchTo().frame(0);//Inside that we are in Frame(0)
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("deepak@gmail.com");
		
		driver.switchTo().parentFrame();//One Frame down
		lastName.clear();
		lastName.sendKeys("Shankar");
		driver.close();
		
	}
	
	
	public void Frame4() { //Using ParentFrame
		
		 driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://letcode.in/frame");
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		WebElement FrameXpath= driver.findElement(By.xpath("//iframe[@id=\"firstFr\"]"));
		driver.switchTo().frame(FrameXpath);
		WebElement FirstName= driver.findElement(By.name("fname"));
		WebElement lastName= driver.findElement(By.name("lname"));
		FirstName.sendKeys("DEEPAK");
		lastName.sendKeys("SHANKAR");
		
	
		
		driver.switchTo().frame(0);//Inside that we are in Frame(0)
		WebElement Email=driver.findElement(By.name("email"));
		Email.sendKeys("deepak@gmail.com");
		
		driver.switchTo().parentFrame();//One Frame down
		lastName.clear();
		lastName.sendKeys("Shankar");
		
		driver.switchTo().parentFrame();
		WebElement Tutorial=	driver.findElement(By.xpath("//*[@class=\"card-footer-item button is-primary\"]"));
		Tutorial.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.close();
		
	}
	
	
}
