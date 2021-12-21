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

public class Task12 extends BaseClass {

	@BeforeClass
	public static void lauchBrowser() {
		launchChrome();
		winMax();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
	}

	@AfterClass
	public static void closeBrowser() {
		System.out.println("Success");
	}

	@BeforeMethod
	public void url() {

		System.out.println(new Date());
	}

	@AfterMethod
	public void endTime() {
		System.out.println(new Date());
	}

	@Test(groups = "Name")
	private void tc1() {
		PojoClass p = new PojoClass();
		fill(p.getFirstName(), "Arun");
	}

	@Test(groups = "Name")
	private void tc2() {
		PojoClass p = new PojoClass();
		fill(p.getLastName(), "Kumar");
	}

	@Test(groups = "contact")
	private void tc3() {
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "greenstech@gmail.com");
	}

	@Test(groups = "contact")
	private void tc4() {
		PojoClass p = new PojoClass();
		fill(p.getMobile(), "9876543210");
	}

	@Test(groups = "dropdown")
	private void tc5() {
		dropDown(driver.findElement(By.id("country")), "4");
	}

	@Test(groups = "address")
	private void tc6() {
		PojoClass p = new PojoClass();
		fill(p.getCity(), "Chennai");
		fill(p.getMessage(), "Framework");
	}

}
