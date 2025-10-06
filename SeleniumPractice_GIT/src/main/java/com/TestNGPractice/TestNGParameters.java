package com.TestNGPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters 
{
	@Test
	@Parameters("Parameter1")
	public void parameterex(String Str1) 
	{
		
		System.out.println("Para 1 "+Str1);
		
	}
	
	@Test
	@Parameters({"Parameter1", "Parameter2"})
	public void parameterex2(String Str1, String Str2) 
	{
		
		System.out.println("Para 1 "+Str1);
		System.out.println("Para 2 "+Str2);
		
	}

}
