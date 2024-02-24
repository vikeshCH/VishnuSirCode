package com.ExceOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Two_Write_Operations {
	@Test(priority = 1)
	public void WriteData_in_ExcelSheet1() throws IOException {

		FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		XSSFSheet dataSheet = workBook.createSheet("MultipleTestData6");
		Row rowData = dataSheet.createRow(4);
		
		for (int index = 0; index < 5; index++) {
			Cell RowOfCell = rowData.createCell(index);
			RowOfCell.setCellValue("Vikesh");
			System.out.println("Write test data from Excel File is:- " + RowOfCell);
		}
		
		System.out.println();
		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		workBook.write(testDataOutputFile);
		System.out.println();

	}

	@Test(priority = 2)
	public void WriteData_in_ExcelSheet2() throws IOException {

		FileInputStream excelTestDataFile1 = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile1);

		XSSFSheet dataSheet = workBook.getSheet("MultipleTestData6");
	    Row rowData = dataSheet.getRow(4);
		
		for (int index = 5; index < 10; index++) {
			Cell RowOfCell = rowData.createCell(index);
			RowOfCell.setCellValue("ramesh");
			System.out.println("Write test data from Excel File is:- " + RowOfCell);
		}
		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		workBook.write(testDataOutputFile);
		System.out.println();
	}
}
