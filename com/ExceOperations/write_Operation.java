package com.ExceOperations;

import java.awt.Font;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_Operation {

	public static void main(String[] args) throws IOException {
		
		FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook2 = new XSSFWorkbook(excelTestDataFile);
		XSSFSheet dataSheet = workBook2.getSheet("TestDataCheckList2");		
		for (int i = 0; i < 10; i++) {
			
			Row rowData = dataSheet.createRow(i);
			Cell RowOfCell = rowData.createCell(2);
			RowOfCell.setCellValue("Vikesh");

			FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
			workBook2.write(testDataOutputFile);
			
			System.out.println("Written test data in Excel File is:- " + RowOfCell);
		}
		
		

//		CellStyle RowOfCell = dataSheet.getWorkbook().createCellStyle();
//		XSSFFont font = dataSheet.getWorkbook().createFont();
//		font.setFontName("Times New Roman");

//		
//		Row rowData1 = dataSheet.createRow(6);
//		Cell RowOfCell1 = rowData1.createCell(4);
//		RowOfCell1.setCellValue("Cherkupalli");
//		FileOutputStream testDataOutputFile1 = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//		workBook.write(testDataOutputFile1);
//		System.out.println("Written test data in Excel File is:- " + RowOfCell1);
//
//		
//		Row rowData2 = dataSheet.createRow(6);
//		Cell RowOfCell2 = rowData2.createCell(7);
//		RowOfCell2.setCellValue("Rocks");
//		FileOutputStream testDataOutputFile2 = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//		workBook.write(testDataOutputFile2);
//		System.out.println("Written test data in Excel File is:- " + RowOfCell2);
//
//		
//		Row rowData3 = dataSheet.createRow(6);
//		Cell RowOfCell3 = rowData3.createCell(8);
//		RowOfCell3.setCellValue("King");
//		FileOutputStream testDataOutputFile3 = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//		workBook.write(testDataOutputFile3);
//		System.out.println("Written test data in Excel File is:- " + RowOfCell3);


		System.out.println();
		
	}

}
