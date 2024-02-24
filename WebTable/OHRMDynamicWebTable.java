package WebTable;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.BaseTest.BaseTest;

public class OHRMDynamicWebTable extends BaseTest {
	
	public void login() throws InterruptedException {	
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	}
	
	public void menu_pim_viewPimModule() throws IOException {	 
		WebElement employeeInformation = driver.findElement(By.id("menu_pim_viewPimModule"));
		employeeInformation.click();	
	}
	
	public void OHRMDynamicWebTableEtireData() {
		
		////table[@id='resultTable']
		
		// Getting WebTable Property
		WebElement webTableProperty = driver.findElement(By.xpath("//table[@id='resultTable']"));
		
		//Getting WebTable Rows Property
		List<WebElement> rows = webTableProperty.findElements(By.tagName("tr"));
		
		for (int rowIndex = 1; rowIndex < rows.size(); rowIndex++) {     // Going to Every Row in the WebTable
			WebElement webTablerow = rows.get(rowIndex);                 // Going to Particular Row in the WebTable
			
			// going to each cell in the Row
			List<WebElement> rowOfCells = webTablerow.findElements(By.tagName("td"));
			
			
			for (int rowOfCellIndex = 1; rowOfCellIndex < rowOfCells.size(); rowOfCellIndex++) { // going to Every cell in the Row
				WebElement rowOfCell = rowOfCells.get(rowOfCellIndex);                           // going to particular cell in a Row
				
				 String data = rowOfCell.getText();
				 System.out.print(data+" | ");
			}	
			System.out.println();
		}
	
	}
	
	public static void main(String[] args) throws InterruptedException, IOException {
		OHRMDynamicWebTable eachCellData = new OHRMDynamicWebTable();
		eachCellData.applicationLaunch();
		eachCellData.login();
		eachCellData.menu_pim_viewPimModule();
		eachCellData.OHRMDynamicWebTableEtireData();
		eachCellData.applicationClose();
	}
}
