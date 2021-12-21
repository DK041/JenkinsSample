package org.pom;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws IOException {

		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		PojoClass p = new PojoClass();
		fill(p.getTxtUser(), getData(0, 0));
		fill(p.getTxtPass(), getData(0, 1));
		btnClick(p.getBtnLogin());

	}
}
