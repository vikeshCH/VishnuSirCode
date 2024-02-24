package webdriverbasic_Part1;
import org.openqa.selenium.chrome.ChromeDriver;

public class LauchChromeBrowser {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.getTitle();
		Thread.sleep(3000);
		driver.getCurrentUrl();
		Thread.sleep(3000);
		driver.getPageSource();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
	}
}
