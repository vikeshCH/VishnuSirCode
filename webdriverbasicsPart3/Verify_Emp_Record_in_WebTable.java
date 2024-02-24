package webdriverbasicsPart3;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Emp_Record_in_WebTable {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		// Enter UserName
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		driver.findElement(By.id("firstName")).sendKeys("Santhosh");
		driver.findElement(By.id("lastName")).sendKeys("Dasoju");
		
		String expectedId = driver.findElement(By.id("employeeId")).getAttribute("value");
		driver.findElement(By.id("btnSave")).click();
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		List<WebElement> itags = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[2]"));
		
		boolean status = false;
		String actualId = null;
		
		for(WebElement id : itags) {
			actualId = id.getText();
			if(actualId.equals(expectedId)) {
				status = true;
				break;
			}
		}	
		if(status) {
			System.out.println("Verify Emp Record - Expected EmpId: "+ expectedId + "Actual EmpId : " + actualId +"----> Test Pass");
		}
		else {
			System.out.println("Verify Emp Record - Expected EmpId: "+ expectedId + "Actual EmpId : " + actualId +"----> Test Fail");
		}
		
		Thread.sleep(5000);
		
		driver.quit();
	}
}
