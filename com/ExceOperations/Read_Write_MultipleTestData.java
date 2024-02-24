package com.ExceOperations;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;

public class Read_Write_MultipleTestData extends BaseTest {

	@Test(priority = 1)
	public void WriteData_in_ExcelSheet1() throws IOException {

		FileInputStream excelTestDataFile = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);

		XSSFSheet dataSheet = workBook.createSheet("MultipleTestData1");
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

		XSSFSheet dataSheet = workBook.getSheet("MultipleTestData1");
		Row rowData = dataSheet.createRow(5);

		for (int index = 5; index < 10; index++) {
			Cell RowOfCell = rowData.createCell(index);
			RowOfCell.setCellValue("ramesh");
			System.out.println("Write test data from Excel File is:- " + RowOfCell);
		}

		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		workBook.write(testDataOutputFile);
		System.out.println();
	}

//	@Test(priority = 3)
//	public void WriteData_in_ExcelSheet3() throws IOException {
//		FileInputStream excelTestDataFile2 = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile2);
//
//		XSSFSheet dataSheet = workBook.getSheet("MultipleTestData1");
//		Row rowData = dataSheet.getRow(4);
//
//		Cell RowOfCell = rowData.createCell(4);
//		RowOfCell.setCellValue("Rajesh");
//		Cell RowOfCell1 = rowData.createCell(5);
//		RowOfCell1.setCellValue("Rajesh");
//		System.out.println("Write test data from Excel File is:- " + RowOfCell);
//		System.out.println(RowOfCell1);
//
//		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//		workBook.write(testDataOutputFile);
//		System.out.println();
//	}
//
//	@Test(priority = 4)
//	public void ReadData_From_ExcelSheet() throws IOException {
//		FileInputStream excelTestDataFile1 = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile1);
//
//		XSSFSheet dataSheet = workBook.getSheet("MultipleTestData1");
//		Row rowData = dataSheet.getRow(4);
//		Cell RowOfCell = rowData.getCell(5);
//
//		System.out.println("Read test data From Excel File is:- " + RowOfCell);
//
//		FileOutputStream testDataOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//		workBook.write(testDataOutputFile);
//
//		System.out.println();
//	}
//
//	@Test(priority = 3)
//	public void Read_operations_MultipleData_on_Excel() throws IOException {
//		FileInputStream multipleTestDataFile3 = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
//
//		XSSFWorkbook workBook = new XSSFWorkbook(multipleTestDataFile3);
//		XSSFSheet testDataSheet = workBook.getSheet("MultipleTestData1");
//
//		// In the Sheet identifying the Number of Active Rows with the data
//		int RowsCount = testDataSheet.getLastRowNum();
//
//		// Should go automatically to every Active Row
//		for (int rowIndex = 2; rowIndex < RowsCount; rowIndex++) { // should goto an active Row
//			Row row = testDataSheet.getRow(rowIndex);
//
//			// Going to an active Row and identifying the number of active Cells
//			int rowOfCellCount = row.getLastCellNum();
//
//			// going to an active row to all its active Cells
//			for (int rowOfCellIndex = 0; rowOfCellIndex < rowOfCellCount; rowOfCellIndex++) { // going to an active Row
//																								// of its active Cell
//				Cell rowOfCell = row.getCell(rowOfCellIndex);
//
//				// get the data from the Row of the Cell
//				String data = rowOfCell.getStringCellValue();
//
//				// print the data of the Excel Sheet into Eclipse Console
//				System.out.print(data + " | ");
//			}
//
//			System.out.println();
//		}
//
//	}
//
	@Test(priority = 3)
	public void CapturingFirstColumnData_in_a_WebTable_CityName() throws IOException {

		String xpathsExpression1 = "/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		String xpathsExpression2 = "]/td[1]";

		FileInputStream path4 = new FileInputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(path4);
		XSSFSheet sheet = workBook.getSheet("MultipleTestData1");

		for (int index = 1; index < 36; index++) {
			Row rowData = sheet.createRow(index);
			Cell rowOfCellData = rowData.createCell(12);

			By cityNameProperty = By.xpath(xpathsExpression1 + index + xpathsExpression2);
			WebElement CityName = driver.findElement(cityNameProperty);
			String CityNameText = CityName.getText();
			System.out.println(CityNameText);

			rowOfCellData.setCellValue(CityNameText);
			FileOutputStream testOutputFile = new FileOutputStream("C:\\Users\\hi\\Desktop\\DataDriven.xlsx");
			workBook.write(testOutputFile);
		}
		System.out.println();

	}

//	@Test(priority = 5)
//	public void capturingDynamicWebTableData() {
//		// Identifying the WebTable
//		// /html/body/div[5]/section[1]/div
//
//		By webTableProperty = By.xpath("/html/body/div[5]/section[1]/div");
//		WebElement webTable = driver.findElement(webTableProperty);
//
//		// Row is identified by the tag name as "tr"
//
//		By rowProperty = By.tagName("tr");
//		// Going to the WebTable and finding the Number of Rows in it
//		List<WebElement> rows = webTable.findElements(rowProperty);
//
//		// in the WebTable - should goto every Row of the WebTable
//		for (int rowIndex = 0; rowIndex < rows.size(); rowIndex++) {
//			// Going to a particular Row
//			WebElement webTableRow = rows.get(rowIndex);
//
//			// IN the current ROw - identifying the number of its corresponding Cells
//			// Row of a Cell is identified in a webTable by tagName as "td"
//
//			By rowOfCellProperty = By.tagName("td");
//
//			// Going to a Particular Row and identifying all its Cells
//			List<WebElement> rowOfCells = webTableRow.findElements(rowOfCellProperty);
//
//			// To goto every Row of all its Corresponding Cells
//			for (int rowOfCellIndex = 0; rowOfCellIndex < rowOfCells.size(); rowOfCellIndex++) {
//				WebElement rowOfCell = rowOfCells.get(rowOfCellIndex);
//				String data = rowOfCell.getText();
//				System.out.print(data + " | ");
//
//			}
//			System.out.println();
//		}
//	}

//	public static void main(String[] args) throws IOException {
//		Read_Write_MultipleTestData testData = new Read_Write_MultipleTestData();
//		testData.readData_From_ExcelSheet();
//		testData.writeData_From_ExcelSheet();
//		testData.both_operations_on_Excel();
//	}

}
