package org.maven;


import java.io.IOException;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task8 extends BaseClass {

	public static void main(String[] args) throws IOException {
		launchChrome();
		loadUrl("https://www.toolsqa.com/selenium-training/#enroll-form");
		winMax();
		WebElement firstName = driver.findElement(By.id("first-name"));
		fill(firstName, getData(0, 0));
		WebElement lastName = driver.findElement(By.id("last-name"));
		fill(lastName, getData(0, 1));
		WebElement email = driver.findElement(By.id("email"));
		fill(email, getData(0, 2));
		WebElement mobile = driver.findElement(By.id("mobile"));
		fill(mobile, getData(0, 3));
		dropDown(driver.findElement(By.id("country")), "4");
		WebElement city = driver.findElement(By.id("city"));
		fill(city, getData(0, 5));
		WebElement message = driver.findElement(By.id("message"));
		fill(message, getData(0, 6));

	}
}
