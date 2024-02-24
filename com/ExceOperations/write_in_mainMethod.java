package com.ExceOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class write_in_mainMethod {
	
	
	public void WriteData_in_ExcelSheet1() throws IOException {
		FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		XSSFSheet dataSheet = workBook.createSheet("MultipleTestData6");
		Row rowData = dataSheet.createRow(0);
		
		Cell RowOfCell = rowData.createCell(0);
		
		RowOfCell.setCellValue("Vikesh");
	
		
		System.out.println("Write test data from Excel File is:- " + RowOfCell);
		System.out.println();
		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		workBook.write(testDataOutputFile);
		System.out.println();

	}

	public void WriteData_in_ExcelSheet2() throws IOException {
		
		FileInputStream excelTestDataFile1 = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile1);

		XSSFSheet dataSheet = workBook.getSheet("MultipleTestData6");
		Row rowData = dataSheet.createRow(1);
		
		Cell RowOfCell = rowData.createCell(2);
		RowOfCell.setCellValue("Ravi");
		
		
		System.out.println("Write test data from Excel File is:- " + RowOfCell);

		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		workBook.write(testDataOutputFile);
		System.out.println();
	}

	public void WriteData_in_ExcelSheet3() throws IOException {
		FileInputStream excelTestDataFile2 = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile2);

		XSSFSheet dataSheet = workBook.getSheet("MultipleTestData6");
		Row rowData = dataSheet.createRow(2);
		
		Cell RowOfCell = rowData.createCell(4);
		RowOfCell.setCellValue("Rajesh");
		
		System.out.println("Write test data from Excel File is:- " + RowOfCell);

		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		workBook.write(testDataOutputFile);
		System.out.println();
	}

	public static void main(String[] args) throws IOException {
		write_in_mainMethod write = new write_in_mainMethod();
		write.WriteData_in_ExcelSheet1();
		write.WriteData_in_ExcelSheet2();
		write.WriteData_in_ExcelSheet3();
	}

}
