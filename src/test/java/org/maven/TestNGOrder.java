package org.maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGOrder {

	@BeforeClass
	private void launchingChrome() {
		System.out.println("Chrome");

	}
	
@AfterClass
private void closingChrome() {
	System.out.println("Close");

}
	
	@BeforeMethod
	private void startTime() {
		System.out.println("Start");

	}
	
	@AfterMethod
	private void endTime() {
		System.out.println("End");

	}
	
	
	
	@Test
	private void tc3() {
		System.out.println("Test 3");

	}
	
	
	@Test
	private void tc1() {
		System.out.println("Test 1");

	}
	 
	
	
	@Test
	private void tc2() {
		System.out.println("Test 2");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
