package com.ExceOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_multipleTestData {

	public void firstentryData() throws IOException {
		FileInputStream address = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(address);

		XSSFSheet page = book.createSheet("HybridFrameWorks");
		Row row0 = page.createRow(0);

		Cell cell0 = row0.createCell(0);
		cell0.setCellValue("project object method");

		Cell cell1 = row0.createCell(1);
		cell1.setCellValue("it is a frame work");

		Cell cell2 = row0.createCell(2);
		cell2.setCellValue("one of popular frame work");

		Cell cell3 = row0.createCell(3);
		cell3.setCellValue("to automate the application");

		Cell cell4 = row0.createCell(4);
		cell4.setCellValue("it is automating");

		FileOutputStream testoutcome = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		book.write(testoutcome);

		System.out.println("this is the actual cell:-" + cell0);
		System.out.println("this is the actual cell:-" + cell1);
		System.out.println("this is the actual cell:-" + cell2);
		System.out.println("this is the actual cell:-" + cell3);
		System.out.println("this is the actual cell:-" + cell4);

	}

	public void secondentryData() throws IOException {
		FileInputStream path = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(path);

		XSSFSheet page = book.getSheet("HybridFrameWorks");
		Row row = page.getRow(0);

		Cell cell0 = row.createCell(5);
		cell0.setCellValue("test NG");

		Cell cell1 = row.createCell(6);
		cell1.setCellValue("it is a frame work");

		Cell cell2 = row.createCell(7);
		cell2.setCellValue("it is a trending");

		Cell cell3 = row.createCell(8);
		cell3.setCellValue("it is the full form of");

		Cell cell4 = row.createCell(9);
		cell4.setCellValue("test next generation");

		FileOutputStream testoutput = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		book.write(testoutput);

		System.out.println("this is the actual cell:-" + cell0);
		System.out.println("this is the actual cell:-" + cell1);
		System.out.println("this is the actual cell:-" + cell2);
		System.out.println("this is the actual cell:-" + cell3);
		System.out.println("this is the actual cell:-" + cell4);

	}

	public void thirdentryData() throws IOException {
		FileInputStream addressofbook = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(addressofbook);

		XSSFSheet page = book.getSheet("HybridFrameWorks");
		Row row = page.getRow(0);

		Cell cell0 = row.createCell(10);
		cell0.setCellValue("cucumber");

		Cell cell1 = row.createCell(11);
		cell1.setCellValue("it is the frame work");

		Cell cell2 = row.createCell(12);
		cell2.setCellValue("it is automated the application");

		Cell cell3 = row.createCell(13);
		cell3.setCellValue("it is trending frame work");

		Cell cell4 = row.createCell(14);
		cell4.setCellValue("it is a simple frame work");

		FileOutputStream testout = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		book.write(testout);

		System.out.println("this is the actual cell:-" + cell0);
		System.out.println("this is the actual cell:-" + cell1);
		System.out.println("this is the actual cell:-" + cell2);
		System.out.println("this is the actual cell:-" + cell3);
		System.out.println("this is the actual cell:-" + cell4);

	}

	public static void main(String[] args) throws IOException {
		write_multipleTestData write = new write_multipleTestData();
		write.firstentryData();
		write.secondentryData();
		write.thirdentryData();

	}
}
