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

public class Task4 extends BaseClass{

	public static void main(String[] args) throws IOException {
		
		createSheet("DemoQa"); 
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\HotelBooking.xlsx");
		FileInputStream fIn  = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fIn);
		Sheet s = w.getSheet("DemoQa");
		Row r = s.createRow(0);
		r.createCell(0).setCellValue("Greens");
		r.createCell(1).setCellValue("Technology");
		r.createCell(2).setCellValue("greenstech@gmail.com");
		r.createCell(3).setCellValue("9876543210");
		r.createCell(4).setCellValue("India");
		r.createCell(5).setCellValue("Chennai");
		r.createCell(6).setCellValue("I'm from Greens Technology");

		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
		System.out.println("success");

	}
}