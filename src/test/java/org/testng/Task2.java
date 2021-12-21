package org.testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Date;

import org.baseclass.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task2 extends BaseClass {

	@BeforeClass
	private void lauchBrowser() {
		launchChrome();
		winMax();
	}

	@AfterClass
	private void closeBrowser() {
		closeChrome();
	}

	@BeforeMethod
	private void url() {
		loadUrl("https://www.redbus.in/");
		System.out.println(new Date());
	}

	@AfterMethod
	private void endTime() {
		System.out.println(new Date());
	}

	@Test
	private void redbus() throws InterruptedException, AWTException {
		String url = driver.getCurrentUrl();
		Assert.assertEquals("https://www.redbus.in/", url);
		driver.findElement(By.id("signin-block")).click();
		driver.findElement(By.id("hc")).click();
		Thread.sleep(4000);
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//input[@placeholder='Enter your mobile number']")).click();
		driver.findElement(By.id("mobileNoInp")).sendKeys("9876543210");
		Thread.sleep(2000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.findElement(By.id("otp-container")).click();
	}
}