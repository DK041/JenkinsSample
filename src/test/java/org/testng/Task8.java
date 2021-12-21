package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task8 extends BaseClass{

	@BeforeClass
	public static void lauchBrowser() {
		launchChrome();
		winMax();
	}

	@AfterClass
	public static void closeBrowser() {
		System.out.println("Success");
	}

	@BeforeMethod
	public void url() {
		loadUrl("http://www.greenstechnologys.com/");
		System.out.println(new Date());
	}

	@AfterMethod
	public void endTime() {
		System.out.println(new Date());
	}

	@Test
private void greens() {
		System.out.println("TC 1");
	
}
}

