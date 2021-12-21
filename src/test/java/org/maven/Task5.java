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

public class Task5 extends BaseClass {

	public static void main(String[] args) throws IOException {
		createSheet("HotelBookingDetails");
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\HotelBooking.xlsx");
		FileInputStream fIn = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("HotelBookingDetails");
		Row r = s.createRow(0);
		r.createCell(0).setCellValue("blablabla");
		r.createCell(1).setCellValue("password");
		r.createCell(2).setCellValue("Greens");
		r.createCell(3).setCellValue("Technology");
		r.createCell(4).setCellValue("Perumbakkam");
		r.createCell(5).setCellValue("1234567890123456");
		r.createCell(6).setCellValue("123");

		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("success");

	}
}