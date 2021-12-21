package org.pom;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.openqa.selenium.By;

public class Task2 extends BaseClass {

	public static void main(String[] args) {

		launchChrome();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		winMax();
		PojoClass p = new PojoClass();
		fill(p.getFirstName(), "Arun");
		fill(p.getLastName(), "Kumar");
		fill(p.getTxtUser(), "greenstech@gmail.com");
		fill(p.getMobile(), "9876543210");
		dropDown(p.getCountry(), "4");
		fill(p.getCity(), "Chennai");
		fill(p.getMessage(), "Framework");
//		WebElement captcha = driver.findElement(By.xpath("//img[@src='/captcha']"));
//		System.out.println(captcha.getText());

	}
}
