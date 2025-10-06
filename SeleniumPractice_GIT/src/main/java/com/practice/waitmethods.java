package com.practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitmethods {
	public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		waitmethods waitmethods= new waitmethods();
		//waitmethods.implicit_wait();
		//waitmethods.Explicit_wait();
	//	waitmethods.Explicit_wait_WaitforVisiblityof();
		waitmethods.Explicit_wait_WaitforPresenceof();
	//	waitmethods.Explicit_wait_WaitforAlert();
		
		

	}

	//Direct Passing
	public void implicit_wait() throws InterruptedException
	
	{     
		  ChromeOptions chrome=new ChromeOptions();
		  chrome.addArguments("--remote-allow-origins=*"); 
		  driver = new ChromeDriver(chrome); 
		  driver.manage().window().maximize();
		  driver.get("https://github.com/");
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		  WebElement inp1= driver.findElement(By.xpath("/html/body/div[1]/div[6]/main/react-app/div/div/div/section[1]/div[1]/div[5]/div/form/section/div/div/span/input"));
		  inp1.sendKeys("email@email.com");
		  Thread.sleep(3000);//3 Seconds
		  driver.close();
		
	}
	//Direct Passing
	public void Explicit_wait() throws Exception
	
	{
		
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://github.com/");
		 
		 
		 WebDriverWait Expwait=new WebDriverWait(driver, Duration.ofSeconds(10));
		// WebElement inp1= Expwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[6]/main/react-app/div/div/div/section[1]/div[1]/div[5]/div/form/section/div/div/span/input")));
		 WebElement inp1= Expwait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div[6]/main/react-app/div/div/div/section[1]/div[1]/div[5]/div/form/section/div/div/span/input")));
		 inp1.sendKeys("email@email.com");
		 Thread.sleep(3000);//3 Seconds
		 driver.close(); 
		 
	}
public void Explicit_wait_WaitforVisiblityof() throws Exception
	
	{
		
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://github.com/");
		
		 
		 WebElement ele= driver.findElement(By.xpath("/html/body/div[1]/div[6]/main/react-app/div/div/div/section[1]/div[1]/div[5]/div/form/section/div/div/span/input"));
		 WaitforVisiblityof(driver,ele,10);
		 Thread.sleep(3000);//3 Seconds
		 driver.close(); 
		 
	}



public void Explicit_wait_WaitforAlert() throws Exception

{
	
	 ChromeOptions chrome=new ChromeOptions();
	 chrome.addArguments("--remote-allow-origins=*"); 
	 driver = new ChromeDriver(chrome); 
	 driver.manage().window().maximize();
	 driver.get("https://letcode.in/alert");
	
	 
	 WebElement AlertBtn= driver.findElement(By.xpath("//*[contains(text(),'Simple Alert')]"));
	 AlertBtn.click();
	 WaitforalertPresent(driver,10);
	 Alert alert=driver.switchTo().alert();
	 alert.accept();
	 Thread.sleep(3000);//3 Seconds
	 driver.close(); 
	 
}

public void Explicit_wait_WaitforPresenceof() throws Exception

{
	
	 ChromeOptions chrome=new ChromeOptions();
	 chrome.addArguments("--remote-allow-origins=*"); 
	 driver = new ChromeDriver(chrome); 
	 driver.manage().window().maximize();
	 driver.get("https://github.com/");
	
	 
	 String ele= "/html/body/div[1]/div[6]/main/react-app/div/div/div/section[1]/div[1]/div[5]/div/form/section/div/div/span/input";
	 WaitforPresenceof(driver,ele,10);
	 WebElement ele1= driver.findElement(By.xpath("/html/body/div[1]/div[6]/main/react-app/div/div/div/section[1]/div[1]/div[5]/div/form/section/div/div/span/input"));
	 ele1.sendKeys("email@email.com");
	 Thread.sleep(3000);//3 Seconds
	 driver.close(); 
	 
}
	
public void Explicit_wait_Titile() throws Exception
	
	{
		
		 ChromeOptions chrome=new ChromeOptions();
		 chrome.addArguments("--remote-allow-origins=*"); 
		 driver = new ChromeDriver(chrome); 
		 driver.manage().window().maximize();
		 driver.get("https://github.com/");
		
		 
		 System.out.println(driver.getTitle());
		 WaitforTitleContains(driver,10);
		 Thread.sleep(3000);//3 Seconds
		 driver.close(); 
		 
	}



	
	
	public static void WaitforVisiblityof(WebDriver driver1, WebElement element, long timeout) throws Exception 
	{
		new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void WaitforInVisiblityof(WebDriver driver1, WebElement element, long timeout) throws Exception 
	{
		new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.invisibilityOf(element));
		
	}

	public static void WaitforPresenceof(WebDriver driver1, String element, long timeout) throws Exception 
	{
		
		new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(element)));
		
	}
	
	public static void WaitforalertPresent(WebDriver driver1,long timeout) throws Exception 
	{
		
		new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.alertIsPresent());
		
	}
	public static void WaitforElementClickable(WebDriver driver1, WebElement element, long timeout) throws Exception 
	{
		
		new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public static void WaitforTitleContains(WebDriver driver1, long timeout) throws Exception 
	{
		
		new WebDriverWait(driver1, Duration.ofSeconds(timeout)).until(ExpectedConditions.titleContains("GitHub"));
		
	}
	
	
	/*
	alertIsPresent()
	elementSelectionStateToBe()
	elementToBeClickable()
	elementToBeSelected()
	frameToBeAvaliableAndSwitchToIt()
	invisibilityOfTheElementLocated()
	invisibilityOfElementWithText()
	presenceOfAllElementsLocatedBy()
	presenceOfElementLocated()
	textToBePresentInElement()
	textToBePresentInElementLocated()
	textToBePresentInElementValue()
	titleIs()
	titleContains()
	visibilityOf()
	visibilityOfAllElements()
	visibilityOfAllElementsLocatedBy()
	visibilityOfElementLocated()*/
}
