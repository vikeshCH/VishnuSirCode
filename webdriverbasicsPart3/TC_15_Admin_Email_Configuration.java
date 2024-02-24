package webdriverbasicsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_15_Admin_Email_Configuration {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_Configuration")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_admin_listMailConfiguration")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("editBtn")).click();
		
		Select dropDown = new Select(driver.findElement(By.id("emailConfigurationForm_cmbMailSendingMethod")));
		dropDown.selectByValue("smtp");
	}
}
