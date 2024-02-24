package WebDriverAdvanced;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowBasedObjects {

	static ChromeDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123.com");
		driver.findElement(By.className("button")).click();

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.id("menu_pim_addEmployee")).click();

		driver.findElement(By.id("firstName")).sendKeys("Virat");

		driver.findElement(By.id("lastName")).sendKeys("Kohli");

		// <input class="duplexBox" type="file" name="photofile" id="photofile">

		WebElement photoFileButton = driver.findElement(By.id("photofile"));
		jsClickOnElement(photoFileButton);

		Runtime.getRuntime().exec("D:\\Professional Images of vikesh\\KohliPhotoFile.exe");

		Thread.sleep(5000);
		driver.findElement(By.id("btnSave")).click();
	}

	public static void jsClickOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
}
