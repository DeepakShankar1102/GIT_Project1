package com.TestNGPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListenersExample implements ITestListener {
	
	 // 1. Runs before each test method starts
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test Started: ");
    }

    // 2. Runs when a test method passes
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test Passed: ");
    }

    // 3. Runs when a test method fails
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test Failed: ");
    }

    // 4. Runs when a test method is skipped
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test Skipped: ");
    }

    // 5. Runs if a test fails but is still within success percentage
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("Test Failed but within Success %: ");
    }

    // 6. Runs if a test fails due to a timeout
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        System.out.println("Test Failed due to Timeout: ");
        onTestFailure(result); // Optionally call onTestFailure as well
    }

    // 7. Runs before <test> tag in XML starts
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test Started: ");
    
}
}
