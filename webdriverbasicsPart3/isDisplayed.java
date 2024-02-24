package webdriverbasicsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		// Enter UserName
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
		Thread.sleep(5000);
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		Thread.sleep(5000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("firstName")).sendKeys("Venkat");
		Thread.sleep(5000);
		driver.findElement(By.id("lastName")).sendKeys("Gunaganti");
		WebElement chkbox = driver.findElement(By.id("chkLogin"));
		chkbox.click();
		if (chkbox.isSelected()) {
			System.out.println("Check box is selected");
		}
		else {
			System.out.println("Check box is not selected");
		}
		WebElement userName = driver.findElement(By.id("user_name"));
		if (userName.isDisplayed()) {
			System.out.println("User Name is Displayed");
		}
		else {
			System.out.println("User Name is not Displayed");
		}
		driver.quit();
	}

}