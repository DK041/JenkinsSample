package org.maven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\dines\\eclipse-workspace\\MavenConfiguration\\ testData\\StudentDetails.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("Sheet1");
		int prows = s.getPhysicalNumberOfRows();
		System.out.println("Physical no.of Rows :" + prows);
		Row r = s.getRow(0);
		int cells = 0;
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				cells++;
			}

		}
		System.out.println("Physical no.of Cells :" + cells);

		System.out.println("_________________________");
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			Row row = s.getRow(i);
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				Cell cell = row.getCell(j);
				int cellType = cell.getCellType();
				if (cellType == 1) {
					String value = cell.getStringCellValue();
					System.out.println(value);
				} else {
					double d = cell.getNumericCellValue();
					long l = (long) d;
					String valueOf = String.valueOf(l);
					System.out.println(valueOf);
				}
			}

		}
		Row createRow = s.createRow(11);
		createRow.createCell(0).setCellValue("Kannan");
		createRow.createCell(1).setCellValue("2112");
		createRow.createCell(2).setCellValue("MBA");
		createRow.createCell(3).setCellValue("Chennai");
		FileOutputStream fout = new FileOutputStream(f);
		w.write(fout);
	}
}
