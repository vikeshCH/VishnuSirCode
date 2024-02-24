package Parameterization;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_ReadData {
	public static void main(String[] args) throws IOException {
		FileInputStream excelTestDataFile = new FileInputStream("C:\\Trainings\\Seleniun-Automation\\CodeBase\\src\\Parameterization\\testdata.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
		XSSFSheet dataSheet = workBook.getSheet("Sheet1");
		XSSFRow rowData = dataSheet.getRow(0);
		XSSFCell RowOfCell = rowData.getCell(2);
		String testData = RowOfCell.getStringCellValue();
		System.out.println("The test data in the Excel File is:- " + testData);	
	}
}
