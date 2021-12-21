package org.pom;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;

public class Task4 extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {

		launchChrome();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		winMax();
		PojoClass p = new PojoClass();
		fill(p.getFirstName(), getData(2, 0));
		fill(p.getLastName(), getData(2, 1));
		fill(p.getTxtUser(), getData(2, 2));
		fill(p.getMobile(), getData(2, 3));
		dropDown(p.getCountry(), "4");
		fill(p.getCity(), getData(2, 4));
		fill(p.getMessage(), getData(2, 5));

	}

}
