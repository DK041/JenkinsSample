package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task4 extends BaseClass{

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
		loadUrl("https://www.flipkart.com/account/login");
		System.out.println(new Date());
	}

	@AfterMethod
	public void endTime() {
		System.out.println(new Date());
	}

	@Test
private void flipkart() {
		PojoClass p = new PojoClass();
	fill(p.getemail(), "greenstechnology@gmail.com");
	fill(p.getpassword(), "Greens@123");
	WebElement password = p.getpassword();
	String Verify = password.getAttribute("value");
	Assert.assertEquals("Greens@123", Verify);
	btnClick(p.getsubmit());
	
}




















}
