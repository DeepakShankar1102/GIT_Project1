package com.practice;

public class Exceptions {
	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		try {
			int c=a/b;
			System.out.println(c);
			//throw new Exception();
			System.out.println("no Exception");
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println("Nullpointer Exception");
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.err.println("NOT POSSIBLE");
			System.out.println("Arithmetic Exception");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println("only Exception");
		}
		finally {
			System.out.println("Print Final");
		}
	}
}

//https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/package-summary.html
