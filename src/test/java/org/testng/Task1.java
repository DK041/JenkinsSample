package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 extends BaseClass {

	@BeforeClass
	private void launchingChrome() {
		launchChrome();
		winMax();
	}

	@AfterClass
	private void closingChrome() {
		closeChrome();

	}

	@BeforeMethod
	private void startTime() {
		loadUrl("https://www.facebook.com/");
		System.out.println(new Date());

	}

	@AfterMethod
	private void endTime() {
		System.out.println(new Date());

	}

	@Test(priority=5, enabled = false)
	private void tc3() throws InterruptedException {
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "Java");
		fill(p.getTxtPass(), "Java@123");
		btnClick(p.getBtnLogin());
		Thread.sleep(2000);
	}

	@Test(priority=-5, enabled = false)
	private void tc1() throws InterruptedException {
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "Greens");
		fill(p.getTxtPass(), "Greens@123");
		btnClick(p.getBtnLogin());
		Thread.sleep(2000);
	}
	

	@Test(invocationCount=3)
	private void tc2() throws InterruptedException {
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "Python");
		fill(p.getTxtPass(), "Python@123");
		btnClick(p.getBtnLogin());
		Thread.sleep(2000);
	}
	}

