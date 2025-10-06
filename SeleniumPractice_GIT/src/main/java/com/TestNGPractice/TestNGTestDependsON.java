package com.TestNGPractice;

import org.testng.annotations.Test;

public class TestNGTestDependsON {
	
	@Test(enabled = false)
	public void FirstTC() {
		
		System.out.println("TC 1");
		
	}
	

	@Test(dependsOnMethods = "FirstTC", alwaysRun = true)
	public void SecondTC() {
		
		System.out.println("TC 2");
		
	}
	
	/*Final Outcome:

		FirstTC → Skipped (disabled)

		SecondTC → Skipped (because its dependency didn’t run)
		*/
	
/*	@Test(dependsOnMethods = "FirstTC", alwaysRun = true)
	 Then SecondTC will still execute even if FirstTC is disabled/skipped/failed.
	*/
	
	//If priority and Depends on given together then Depends on will take it up
	//If Depends on belongs to Different package then give like Packagename.classname.Methodname
	//enabled = false, always run= true (consider enabled as a priority)
	
	/* some more attributes
	 * Invocation count=3 ==> Run 3 Times a Test
	 * Invication Timeout= 10000 ==> Run these test cases within 10000ms else failed (depends on invocation count)
	 * Threadpoolsize= 3 ==> similar to thread count run (depends on invocation count)
	 * Timeout =10000 ==> we can provide without invocation count
	 * ExpectedException ={Nosuchelement.class}==> Run the Test even this exception occurs
	 */
	
	

}
