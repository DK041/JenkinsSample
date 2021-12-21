package org.maven;

import java.io.IOException;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.openqa.selenium.By;

public class BrowserLaunch extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		printTitle();
		currentUrl();
		PojoClass p= new PojoClass();
		fill(p.getTxtUser(),getData(0, 1));
		fill(p.getTxtPass(), getData(0, 2));
		btnClick(p.getBtnLogin());
	
			}

}
