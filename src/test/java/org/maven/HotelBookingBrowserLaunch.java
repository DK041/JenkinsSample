package org.maven;
import java.io.IOException;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class HotelBookingBrowserLaunch extends BaseClass {

	public static void main(String[] args) throws InterruptedException, IOException {
		launchChrome();
		loadUrl("http://adactinhotelapp.com/");
		winMax();
		printTitle();
		currentUrl();
		WebElement username = driver.findElement(By.id("username"));
		fill(username, getData(0, 0));
		WebElement pass = driver.findElement(By.id("password"));
		fill(pass, getData(0, 1));
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("location"));
		driver.findElement(By.xpath("//option[@value='Brisbane']")).click();
		driver.findElement(By.id("hotels"));
		driver.findElement(By.xpath("//option[@value='Hotel Cornice']")).click();
		driver.findElement(By.id("room_type"));
		driver.findElement(By.xpath("//option[@value='Deluxe']")).click();
		driver.findElement(By.id("room_nos"));
		driver.findElement(By.xpath("//option[@value='1']")).click();
		driver.findElement(By.id("Submit")).click();

		Thread.sleep(3000);
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		WebElement firstName = driver.findElement(By.id("first_name"));
		fill(firstName, getData(0, 2));
		WebElement lastName = driver.findElement(By.id("last_name"));
		fill(lastName, getData(0, 3));
		WebElement address = driver.findElement(By.id("address"));
		fill(address, getData(0, 4));
		WebElement ccNum = driver.findElement(By.id("cc_num"));
		fill(ccNum, getData(0, 5));
		driver.findElement(By.id("cc_type"));
		driver.findElement(By.xpath("//option[@value='VISA']")).click();
		driver.findElement(By.id("cc_exp_month"));
		driver.findElement(By.xpath("//option[@value='3']")).click();
		driver.findElement(By.id("cc_exp_year"));
		driver.findElement(By.xpath("//option[@value='2022']")).click();
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		fill(cvv, getData(0, 6));
		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(5000);
		String attribute = driver.findElement(By.id("order_no")).getAttribute("value");
		System.out.println(attribute);
		updateExcel(attribute);
 
	}
}
