package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\testdata.xlsx");
		//FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String cellValue = sheet.getRow(2).getCell(0).getStringCellValue();
		System.out.println(cellValue);	
	}

}
