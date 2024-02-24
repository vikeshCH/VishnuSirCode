package webdriverbasic_Part1;

import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchFireFoxBrowser {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.getTitle();
		Thread.sleep(5000);
		driver.getCurrentUrl();
		Thread.sleep(5000);
		driver.getPageSource();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.close();
	}
}
