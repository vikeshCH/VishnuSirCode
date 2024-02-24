package com.ExceOperations;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		
		FileInputStream path = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook  = new XSSFWorkbook(path);
		XSSFSheet sheet = workBook.getSheet("MultipleTestData");
		
		
		int rowCount = sheet.getLastRowNum();
		System.out.println(" Total no.of Rows in Excel Sheet"+rowCount);
		
		for (int rowIndex = 4; rowIndex <= rowCount; rowIndex++) {
			
			Row row = sheet.getRow(rowIndex);
			
			int rowOfCellCount = row.getLastCellNum();
			
			for (int rowOfCellIndex = 1; rowOfCellIndex < 4; rowOfCellIndex++) {
				Cell  rowOfCell = row.getCell(rowOfCellIndex);
				String data = rowOfCell.getStringCellValue();
				System.out.print(rowIndex+ data +" | ");
			}
			System.out.println();
			System.out.println(" Total no.of Columns in Excel Sheet"+rowOfCellCount);
		}
		
	
	}

}
