package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task3 extends BaseClass {

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
	private void toolsQa() {
		String title = driver.getTitle();
		Assert.assertEquals("Check the Title", "Tools QA - Selenium Training", title);
		PojoClass p = new PojoClass();
		fill(p.getFirstName(), "Arun");
		fill(p.getLastName(), "Kumar");
		fill(p.getTxtUser(), "greenstech@gmail.com");
		fill(p.getMobile(), "9876543210");
		dropDown(driver.findElement(By.id("country")), "4");
		fill(p.getCity(), "Chennai");
		fill(p.getMessage(), "Framework");

	}

}
