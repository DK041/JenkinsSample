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

public class Task11 extends BaseClass {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\HotelBooking.xlsx");
		FileInputStream fIn = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.createSheet("Naukri");
		Row r = s.createRow(0);
		r.createCell(0).setCellValue("Greens");
		r.createCell(1).setCellValue("greenstechnology@gmail.com");
		r.createCell(2).setCellValue("Greens@123");
		r.createCell(3).setCellValue("9876543210");
		FileOutputStream fOut = new FileOutputStream(f);
		w.write(fOut);
		w.getSheet("Naukri");
		WebElement name = driver.findElement(By.id("name"));
		fill(name, getData(0, 0));
		WebElement email = driver.findElement(By.id("email"));
		fill(email, getData(0, 1));
		//WebElement email = driver.findElement(By.id("email"));
		fill(name, getData(0, 2));
	//	WebElement name = driver.findElement(By.id("name"));
		fill(name, getData(0, 3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
