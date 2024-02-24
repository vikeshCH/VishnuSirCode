package OrangeHRM_Assignmet_TestCase_Execution;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddEmployee extends BaseClass {

	public void navigateToPimModule() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
	}

	public void navigateToAddEmployee() {
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	}

	public String navigateToAddEmployeeDetails() {
		driver.findElement(By.id("firstName")).sendKeys("sachin");
		driver.findElement(By.id("lastName")).sendKeys("Tendulkar");
		// Employee Id Stored in a Variable
		String expectedEmpId = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		return expectedEmpId;
	}

	public void navigateToEmployeeList() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();

	}

	public void VerifyRecordinEmployeeTable(String expectedEmpId) {

		List<WebElement> ids = driver.findElements(By.xpath("//table[@id = 'resultTable']/tbody/tr/td[2]"));
		boolean status = false;
		String actualId = null;

		for (WebElement id : ids) {
			actualId = id.getText();
			if (actualId.equals(expectedEmpId)) {
				status = true;
				break;
			}
		}
		if (status) {
			System.out.println("Verify Emp Record - Expected EmpId : " + expectedEmpId + "Actual EmpId: " + actualId
					+ "---> Test Pass");
		} else {
			System.out.println("Verify Emp Record - Expected EmpId : " + expectedEmpId + "Actual EmpId: " + actualId
					+ "---> Test Fail");
		}

	}

}
