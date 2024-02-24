package TCSforOrangeHRMApp;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_5_Admin_Add_Organisation_Deails {
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
		driver.findElement(By.id("menu_admin_Organization")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_admin_viewOrganizationGeneralInformation")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("btnSaveGenInfo")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("organization_name")).sendKeys("LiveTech");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_phone")).sendKeys("90000 08814");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_email")).sendKeys("info@livetech.co.in");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_street1")).sendKeys("Sathyam Road,Nilgiri Block,Beside Ammerpet Metro Station,Ammerpet");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_city")).sendKeys("Hyderabad");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_zipCode")).sendKeys("500038");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_note")).sendKeys("Live Tech is an Coaching Organization for Testing Tools, Venkata Ramana Reddy is the Managing Director and Founder of Live Tech having 21+ Years of Teaching Experience");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_taxId")).sendKeys("R14762");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_registraionNumber")).sendKeys("BNQLT2409273");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_fax")).sendKeys("1256/+91");
		Thread.sleep(5000);
		driver.findElement(By.id("organization_province")).sendKeys("Telangana");
		Thread.sleep(5000);
		Select country = new Select(driver.findElement(By.id("organization_country")));
		country.selectByValue("IN");
		driver.findElement(By.id("btnSaveGenInfo")).click();
	}
}
