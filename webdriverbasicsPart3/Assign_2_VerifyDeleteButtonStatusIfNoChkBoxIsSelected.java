package webdriverbasicsPart3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign_2_VerifyDeleteButtonStatusIfNoChkBoxIsSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		// Enter UserName
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		
		List<WebElement> chkBoxes = driver.findElements(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_9\"]"));
		boolean status = false;
		
		for(WebElement checkBox:chkBoxes) {
			boolean chkStatus = checkBox.isSelected();
			if(chkStatus) {
				status = true;
			}
			
			if(!status) {
				System.out.println("Check Box is not Selected ---> Test Pass");
				boolean deleteBtnStatus = driver.findElement(By.id("btnDelete")).isEnabled();
				
				if (!deleteBtnStatus) {
					System.out.println("Button is Disabled ----> Test Pass");
				}
				else {
					System.out.println("Button is Enabled ----> Test Fail");
				}
			}
			else {
				System.out.println("Check Box is Selected -----> Test Fail");
			}
		}
		
		
		
		
		driver.quit();
	}
}
