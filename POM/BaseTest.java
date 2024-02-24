package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	public static WebDriver driver;

	public void LaunchBrowser() {
		String browser = "chrome";
		if (browser.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {

			System.setProperty("webdriver.gecko.driver",
					"C:\\Trainings\\Seleniun-Automation\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {

			System.setProperty("webdriver.edge.driver",
					"C:\\Trainings\\Seleniun-Automation\\Softwares\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();

		} else {
			System.out.println("Invalid input for the Browser");
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	}

	public void LaunchApplication() {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

	}

	public void CloseBrowser() {
		driver.quit();

	}

}
