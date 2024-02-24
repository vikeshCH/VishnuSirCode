package WebDriverAdvanced;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123.com");
		driver.findElement(By.className("button")).click();

		By pimElementProperty = By.id("menu_pim_viewPimModule");
		WebElement pim = driver.findElement(pimElementProperty);
		pim.click();
		WebElement linkEmpInfo = driver.findElement(By.xpath("//div[@id='employee-information']//following::h1"));

		Actions actions = new Actions(driver);

		actions.moveToElement(linkEmpInfo).build().perform();

		WebElement tipMsg = driver.findElement(By.id("tiptip_content"));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(tipMsg));
		
		String actualmsg = tipMsg.getText();

		System.out.println("Msg---->"+actualmsg);
		if (actualmsg.equals("Hide Options")) {
			System.out.println("Test Pass");
		} else {
			System.out.println("Test Fail");
		}
	}
}
