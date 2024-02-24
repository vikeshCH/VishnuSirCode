package TCSforOrangeHRMApp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_8_Admin_Jobs_PayGrade {
	public static void main(String args[]) throws InterruptedException {
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
		driver.findElement(By.id("menu_admin_viewPayGrades")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnAdd")).click();
		driver.findElement(By.id("payGrade_name")).sendKeys("VishnuVardhan Reddy");
		driver.findElement(By.id("btnSave")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnAddCurrency")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("payGradeCurrency_currencyName")).sendKeys("INR - Indian Rupee");
		Thread.sleep(5000);
		driver.findElement(By.id("payGradeCurrency_minSalary")).sendKeys("68550.65");
		Thread.sleep(5000);
		driver.findElement(By.id("payGradeCurrency_maxSalary")).sendKeys("98650.55");
		Thread.sleep(5000);
		driver.findElement(By.id("btnSaveCurrency")).click();
	}
}
