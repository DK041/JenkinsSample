package org.testng;

import java.util.Date;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.testng.annotations.*;

public class Task14 extends BaseClass {

	@BeforeClass
	private void launchbrowser() {
		launchChrome();
		winMax();
			}

	@AfterClass
	private void closebrowser() {
		System.out.println("success");
	}

	@BeforeMethod
	private void url() {
		driver.manage().deleteAllCookies();
		loadUrl("https://mail.google.com/");
	}

	@AfterMethod
	private void date() {
		System.out.println(new Date());

	}

	@Parameters({ "email", "password" })
	@Test
	private void tc(String s1, String s2) throws InterruptedException {
		PojoClass p = new PojoClass();
		fill(p.getMailid(), s1);
		Thread.sleep(3000);
		btnClick(p.getNext());
		Thread.sleep(2000);
		fill(p.getGmailPass(), s2);
	}

}
