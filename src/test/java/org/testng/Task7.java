package org.testng;

import org.baseclass.BaseClass;
import org.baseclass.PojoClass;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task7 extends BaseClass {

	@Parameters({ "Browser" })
	@Test
	private void tc1(String name) {

		if (name.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (name.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		PojoClass p = new PojoClass();
loadUrl("https://www.flipkart.com/account/login");
winMax();
fill(p.getemail(), "greenstechnology@gmail.com");
fill(p.getpassword(), "Greens@123");

	}
}