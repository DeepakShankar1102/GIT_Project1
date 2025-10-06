package com.TestNGPractice;

import org.testng.annotations.Test;

public class TestNGTestPriority {
	
	@Test(priority = -1)
	public void FirstTC() {
		
		System.out.println("TC 1");
		
	}
	

	@Test(priority = -2)
	public void ABCTC5() {
		
		System.out.println("TC 2");
		
	}
	
	@Test(priority = 0)
	public void ZZXX() {
		
		System.out.println("TC 3");
		
	}
	
	@Test(priority = 1)
	public void ZZZ() {
		
		System.out.println("TC 4");
		
	}
	@Test
	public void SETS() {
		
		System.out.println("TC 5");
		
	}
	
	@Test(enabled=false)
	public void SETS2() {
		
		System.out.println("TC 6");
		
	}
	
	// Execute in order of priority values (-2, -1, 0, 1, 2)
	// If priority not given, it is treated as priority = 0
	// If priority values are different, alphabetical order is ignored
	// If priority values are the same, alphabetical order is used within that group
	//To skip a test give enabled as false

}
