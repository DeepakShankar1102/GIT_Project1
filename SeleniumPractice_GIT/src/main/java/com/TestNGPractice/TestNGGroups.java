package com.TestNGPractice;

import org.testng.annotations.Test;

public class TestNGGroups {

	@Test(groups={"Smoke"})

	public void Group1() {

		System.out.println("This group is for smoke Test ");

	}
	@Test(groups={"Regression"})
	public void Group2() {

		System.out.println("This group is for Regression Test ");

	}

}
