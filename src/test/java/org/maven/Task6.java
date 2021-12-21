package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Task6 extends BaseClass {

	public static void main(String[] args) throws IOException, InterruptedException {

		createSheet("FacebookDetails");
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\HotelBooking.xlsx");
		FileInputStream fIn = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("FacebookDetails");
		Row r = s.createRow(0);
		r.createCell(0).setCellValue("Greens");
		r.createCell(1).setCellValue("Greens@123");
		r.createCell(2).setCellValue("Java");
		r.createCell(3).setCellValue("Java@123");
		r.createCell(4).setCellValue("Python");
		r.createCell(5).setCellValue("Python@123");
		FileOutputStream fOut = new FileOutputStream(f);
		w.write(fOut);		
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winMax();
		currentUrl();
		printTitle();
		WebElement txtUser = driver.findElement(By.id("email"));
		fill(txtUser, getData(0, 0));
		WebElement txtPass = driver.findElement(By.id("pass"));
		fill(txtPass, getData(0, 1));
		WebElement btn = driver.findElement(By.xpath("//button[@name='login']"));
		btnClick(btn);
		Thread.sleep(5000);
		WebElement error = driver.findElement(By.xpath("//div[contains(text(),'incorrect')]"));
		gettxt(error);

	}
}