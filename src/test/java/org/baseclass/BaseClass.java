package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static void launchChrome() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchFirefox() {

		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	public static void loadUrl(String Url) {
		driver.get(Url);

	}
	public static void incognito() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");

		driver = new ChromeDriver(options);

	}

	public static void winMax() {
		driver.manage().window().maximize();
	}

	public static void printTitle() {
		System.out.println(driver.getTitle());

	}

	public static void currentUrl() {
		System.out.println(driver.getCurrentUrl());

	}

	public static void fill(WebElement ele, String value) {
		ele.sendKeys(value);

	}

	public static void dropDown(WebElement drop, String value) {
		Select s = new Select(drop);
		s.selectByValue(value);

	}

	public static void btnClick(WebElement ele) {
		ele.click();

	}

	public static void closeChrome() {
		driver.close();

	}

	public static void dropBox(WebElement icon) {
		icon.click();
	}

	public static void gettxt(WebElement ele) {
		System.out.println(ele.getText());
	}

	public static void attributetxt(WebElement txt, String value) {
		txt.getAttribute(value);
	}

	public static void createSheet(String name) throws IOException {

		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\HotelBooking.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		w.createSheet(name);

		FileOutputStream fout = new FileOutputStream(f);

		w.write(fout);
	}

	public static void updateExcel(String value) throws IOException {
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\HotelBooking.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("HotelBookingDetails");

		Row row = s.createRow(1);

		row.createCell(0).setCellValue(value);
		
		FileOutputStream fout = new FileOutputStream(f);

		w.write(fout);
	}

	public static String getData(int rowNumber, int cellNumber) throws IOException {

		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\HotelBooking.xlsx");

		FileInputStream fin = new FileInputStream(f);

		Workbook w = new XSSFWorkbook(fin);

		Sheet s = w.getSheet("HotelBookingDetails");

		Row row = s.getRow(rowNumber);

		Cell cell = row.getCell(cellNumber);

		String value = "";

		int cellType = cell.getCellType();

		if (cellType == 1) {

			value = cell.getStringCellValue();

		} else {

			double d = cell.getNumericCellValue();

			long l = (long) d;

			value = String.valueOf(l);
		}
		return value;
	}

}
