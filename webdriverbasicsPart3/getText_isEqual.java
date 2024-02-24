package webdriverbasicsPart3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText_isEqual {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		// Enter UserName
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123");
		driver.findElement(By.className("button")).click();
		
		String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		String expectedMessage = "Invalid credentials";
		if (actualMessage.equals(expectedMessage)) {
			System.out.println("Actual & Expected Text is Same : "+ actualMessage + "----->Test Pass");
		}
		else {
			System.out.println(actualMessage + "Test Fail");
		}
		driver.quit();
		
	}
}
