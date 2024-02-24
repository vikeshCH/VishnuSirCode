package OOPS_Interface; 

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ALLmyBrowsers implements MyWebDriver{
	WebDriver driver = null;
	String browser = "edge";
	
	
	public void LaunchBrowser() {
		if (browser.equals("chrome")) {

		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		
		else if (browser.equals("firefox")) {
			
		System.setProperty("webdriver.gecko.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		}
		else if (browser.equals("edge")) {
			
			System.setProperty("webdriver.edge.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			
			}
	}
	
	
	public void LaunchApplication() {
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		
	}

	public void Login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		driver.findElement(By.className("button")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		
	}

	public void Logout() {
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}

	public void CloseBrowser() {
		driver.quit();
		
	}
	

}
