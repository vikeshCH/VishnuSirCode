package webdriverbasicsPart3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableData {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		WebElement password  = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Vikesh@123star");
		WebElement login = driver.findElement(By.id("btnLogin"));
		login.click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		List<WebElement> wt_Values = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr"));
		System.out.println(wt_Values.size());
		
		for (int i = 1; i <= wt_Values.size(); i++) {
			List<WebElement> wt_Col_Value = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr[" +i+ "]/td"));
			System.out.println(wt_Col_Value.size());
			for (int j = 0; j <= wt_Col_Value.size(); j++) {
				List<WebElement> TBValue  = driver.findElements(By.xpath(".//*[@id='resultTable']/tbody/tr[\"+i+\"]/td[" +j+ "]"));
				System.out.println(((WebElement) TBValue).getText());
			}
		}
	}
}
