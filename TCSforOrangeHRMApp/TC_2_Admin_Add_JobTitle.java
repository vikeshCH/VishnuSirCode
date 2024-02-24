package TCSforOrangeHRMApp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_2_Admin_Add_JobTitle {
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
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("btnAdd")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Sr. Architect QA");
		Thread.sleep(5000);
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Review and understand existing bug reports, test plans, test processes. Produce documentation for improved test strategy and procedures to implement improved test processes. This includes functional, regression, performance, security, and other methodologies, and guides QA in making improved test plans.");
		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();
	}
}
