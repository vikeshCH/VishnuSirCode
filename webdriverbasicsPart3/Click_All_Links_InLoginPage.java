package webdriverbasicsPart3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Click_All_Links_InLoginPage {
	public static void main(String args[]) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		List<WebElement> all_Links = driver.findElements(By.tagName("a"));
		int count = all_Links.size();
		
		/// Used for Static Webpage
//		for (int i=0; i<=4; i++) {
//			all_Links.get(i).click();
//		}
		
		/// Used for Dynamic Webpage
		
		for (int i=0; i<=count; i++) {
			all_Links.get(i).click();
		}
		
		// Used for only iterating all the list in a  Webpage
//		for (WebElement element:all_Links) {
//			element.click();
//		}
		
	}
}
