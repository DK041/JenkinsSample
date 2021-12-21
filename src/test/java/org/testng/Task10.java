package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task10 extends BaseClass {

	@BeforeClass
	public static void lauchBrowser() {
		launchChrome();
		winMax();
	}

	@AfterClass
	public static void closeBrowser() {
		closeChrome();
	}

	@BeforeMethod
	public void url() {
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		System.out.println(new Date());
	}

	@AfterMethod
	public void endTime() {
		System.out.println(new Date());
	}

	@Test
	private void tc1() {

		PojoClass p = new PojoClass();
		fill(p.getFirstName(), "Arun");
		fill(p.getLastName(), "Kumar");

	}

	@Test
	private void tc2() {

		PojoClass p = new PojoClass();

		fill(p.getTxtUser(), "greenstech@gmail.com");
		fill(p.getMobile(), "9876543210");

	}

	@Test
	private void tc3() {
		Assert.assertTrue(false, "Test case Failed");
		PojoClass p = new PojoClass();
		dropDown(driver.findElement(By.id("country")), "4");
		fill(p.getCity(), "Chennai");
		fill(p.getMessage(), "Framework");

	}
}
