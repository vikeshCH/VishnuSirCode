package TCSforOrangeHRMApp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_3_Add_WorkShifts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		Thread.sleep(5000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_admin_Job")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_admin_workShift")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("workShift_name")).sendKeys("Mid-Day-Shift");
		Thread.sleep(5000);
		driver.findElement(By.id("workShift_workHours_from")).click();
		Select workHours_from1 = new Select(driver.findElement(By.id("workShift_workHours_from")));
		workHours_from1.selectByVisibleText("10:00");
		Thread.sleep(5000);
		Select workShift_workHours_to2 = new Select(driver.findElement(By.id("workShift_workHours_to")));
		workShift_workHours_to2.selectByVisibleText("16:00");
		Thread.sleep(5000);
		Select workShift_availableEmpName = new Select(driver.findElement(By.id("workShift_availableEmp")));
		workShift_availableEmpName
		.selectByVisibleText("Sai Dinesh");
		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();	
	}
}
