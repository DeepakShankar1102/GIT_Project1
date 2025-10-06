package com.DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderEx {
	
	
	//Data provider 1
	@DataProvider(name="Input")
	public String[][] getdata() 
	{
		
		String[][] Inputs= new String [1][2];// 1 row 2 columns
		
		Inputs[0][0]= "Admin";
		Inputs[0][1]= "Admin123";
		
		return Inputs;
		
		
	}
	
	//Data provider 2
		@DataProvider(name="Input2")
		public String[][] getdata1() 
		{
			
			String[][] Inputs= new String [2][2];// 2 rows 2 columns
			
			Inputs[0][0]= "Admin";
			Inputs[0][1]= "Admin123";
			
			Inputs[1][0]= "Admin";
			Inputs[1][1]= "Admin123";
			
			return Inputs;
			
			
		}
		
		//Data provider 3 2D directly
				@DataProvider(name="Input3")
				public String[][] getdata2() 
				{
					
					String[][] Inputs= {
					
							{ "Admin","Admin123"},
							{ "Admin","Admin123"}
					
					};
					
					return Inputs;
					
					
				}
				
				
				
				
				//Data provider 4 2D directly but initialize it first and return it 

				String[][] Inputs= {
				
						{ "Admin","Admin123"},
						{ "Admin","Admin123"},
						{ "Admin","Admin123"}
				
				};
				
				@DataProvider(name="Input4")
				public String[][] getdata3() 
				{
					
					
					return Inputs;
					
					
				}
				
				//Data provider 5 1D directly
				@DataProvider(name="Input5")
				public String[] getdata4() 
				{
					
					String[] Inputs= {
					
							"Admin","Admin123"
					
					};
					
					return Inputs;
					
					
				}
				
	public WebDriver driver;
/*	@Test(dataProvider = "Input4")
	public void Dataprovider(String Uname, String Pwd) throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(Pwd);
		driver.close();
		
		
		
	}*/
	
	//Using 1D array
	@Test(dataProvider = "Input5")
	public void Dataprovider1(String Uname) throws InterruptedException
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		
		driver.findElement(By.name("username")).sendKeys(Uname);
		driver.findElement(By.name("password")).sendKeys(Uname);
		driver.close();
		
		
		
	}

}
