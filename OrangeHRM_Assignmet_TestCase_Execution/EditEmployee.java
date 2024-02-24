package OrangeHRM_Assignmet_TestCase_Execution;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditEmployee extends BaseClass {
	
	public void navigateToPimModule() {
		driver.findElement(By.id("menu_pim_viewPimModule")).click();

	}
	public void navigateToAddEmployee() {
		driver.findElement(By.id("menu_pim_addEmployee")).click();
	}

	public String addEmployeeDetails() {
		driver.findElement(By.id("firstName")).sendKeys("VishnuVardhan");

		driver.findElement(By.id("lastName")).sendKeys("Reddy");
		 String expectedEmpId1 = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
        return expectedEmpId1;
	}

	public void navigateToEmployeeList() {
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
	}

	public void verifyRecordInEmployeeList(String expectedEmpId1) {
		List<WebElement> ids = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
		boolean status = false;
		String actualId = null;
		for (WebElement id : ids) {
			actualId = id.getText();
			if (actualId.equals(expectedEmpId1)) {
				status = true;
				break;
			}
		}
		if (status) {
			System.out.println(
					"Verify Emp Record- Expected EmpId: " + expectedEmpId1 + "Actual EmpId: " + actualId + "-->Test Pass");
		} else {
			System.out.println(
					"Verify Emp Record- Expected EmpId: " + expectedEmpId1 + "Actual EmpId: " + actualId + "-->Test Fail");
		}
	}
	
	
	public void editEmployee() {
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		///html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[10]/td[3]/a
		WebElement firstName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[10]/td[3]/a"));
		String ramakanth = firstName.getText();
		System.out.println(ramakanth);
		WebElement lastName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[10]/td[4]/a"));
		String naidu = lastName.getText();
		System.out.println(naidu);
		WebElement iD_ram = driver.findElement(By.xpath("//table/tbody/tr/td/a[text()=0013]"));
		iD_ram.click();
		///*[@id="resultTable"]/tbody/tr[5]/td[3]/a[text()='Venkat']
		////table[@id = 'resultTable']/tbody/tr[3]/a[text()='Venkat']
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("personal_txtEmpFirstName")).clear();
		driver.findElement(By.id("personal_txtEmpLastName")).clear();
		
		driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("vanil");
		driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("kumar");
		driver.findElement(By.id("btnSave")).click();
		
	
		
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		WebElement firstName_V = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[13]/td[3]/a"));
		String venkayya = firstName_V.getText();
		System.out.println(venkayya);
		WebElement lastName_Naidu = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[4]/table/tbody/tr[13]/td[4]/a"));
		String naidu_last = lastName_Naidu.getText();
		System.out.println(naidu_last);
		
		if (ramakanth != venkayya) {
			if(naidu != naidu_last) {
				System.out.println("First Names & Last Names are changed ----> Test Pass");
			}
		}
		else {
			System.out.println("First Names & Last Names are not changed -----> Test Fail");
		}	
		
	}
}
