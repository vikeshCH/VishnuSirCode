package Parameterization;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilizeData {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		Workbook wbook;
		Sheet sheet;

		String path = "C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\TestData_For_OrangeHRM_Appliction.xlsx";
		File file = new File(path);
		FileInputStream fis = new FileInputStream(file);

		if (path.endsWith(".xlsx")) {
			 wbook = new XSSFWorkbook(fis);
		} else {
			 wbook = new HSSFWorkbook();
		}

		sheet = wbook.getSheetAt(0);
		String cellValue = sheet.getRow(1).getCell(0).getStringCellValue();
		System.out.println(cellValue);
	}

}
