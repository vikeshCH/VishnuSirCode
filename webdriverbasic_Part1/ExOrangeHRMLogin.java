package webdriverbasic_Part1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExOrangeHRMLogin {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		// Enter UserName
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="XtxtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.partialLinkText("Welcome")).click();
	}
}

