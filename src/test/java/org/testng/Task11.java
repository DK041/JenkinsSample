package org.testng;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.testng.annotations.*;

public class Task11 extends BaseClass {

	@Test(groups = "Valid details")
	private void tc1() {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com/");
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "Greens");
		fill(p.getTxtPass(), "Greens@123");
	}
	
	@Test(groups = "Invalid details")
	private void tc2() {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com/");
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "Selenium");
		fill(p.getTxtPass(), "Java@123");
	}

	@Test(groups = "Valid details")
	private void tc3() {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com/");
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "Java");
		fill(p.getTxtPass(), "Java@123");

	}

	@Test(groups = "Invalid details")
	private void tc4() {
		launchChrome();
		winMax();
		loadUrl("https://www.facebook.com/");
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), "Python");
		fill(p.getTxtPass(), "Java123");
	}
}
