package WebTable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseTest;


public class ohrmFetchingWebTableData extends BaseTest {
	
	public void login() throws InterruptedException {	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
	
	public void getWebTableData() throws IOException {
		 
		
		WebElement employeeInformation = driver.findElement(By.id("menu_pim_viewPimModule"));
		employeeInformation.click();
		
		
		WebElement firstCellData = driver.findElement(By.xpath("//*[@id=\"resultTable\"]/thead/tr"));
		String name = firstCellData.getText();
		
		System.out.println(" The Name of the Employee :- " +name);
		

		String xpath1 = "//*[@id=\"resultTable\"]/tbody/tr[";
		String xpath2 = "]/td[3]";
		
		for (int i = 1; i < 43; i++) {
			
			for (int j = 0; j <1 ; j++) {
				FileInputStream excelTestDataFile = new FileInputStream("C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\TestDataFamily.xlsx");
				XSSFWorkbook workBook = new XSSFWorkbook(excelTestDataFile);
				WebElement thirdColumnCellsData = driver.findElement(By.xpath(xpath1+ i +xpath2));
				String thirdColumn = thirdColumnCellsData.getText();
				System.out.println(" index - "+i+" - Employee Name - " +thirdColumn);
				
				
				Sheet dataSheet = workBook.getSheet("OHRMWebTableData");
				Row newRow = dataSheet.createRow(j);
				Cell newRowOfCell = newRow.createCell(i);
				newRowOfCell.setCellValue(thirdColumn);
				FileOutputStream testOutputFile = new FileOutputStream("C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\TestDataFamily.xlsx");
				workBook.write(testOutputFile);
			}
		}
			
		
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		ohrmFetchingWebTableData celldata = new ohrmFetchingWebTableData();
		celldata.applicationLaunch();
		celldata.login();
		celldata.getWebTableData();
		celldata.applicationClose();
	}
	
}
