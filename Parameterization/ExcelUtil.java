package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtil {

	public static void main (String args[]) {
		try {
			
			//C:\Trainings\Selen1iun-Automation\CodeBase\resources\TestData_For_OrangeHRM_Appliction.xlsx
			String path = "C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\testdata.xlsx";
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);			
		    Workbook wbook = new XSSFWorkbook(fis);
			Sheet sheet = wbook.getSheet("DataTest");
			String cellValue = sheet.getRow(0).getCell(0).getStringCellValue();
			System.out.println(cellValue);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}