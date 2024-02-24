package webdriverbasicsPart3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyAddEmployeeFields {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		// Enter UserName
		Thread.sleep(5000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
		Thread.sleep(3000);
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		Thread.sleep(3000);
		driver.findElement(By.className("button")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("firstName")).sendKeys("Raj");
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys("Kumar");
		Thread.sleep(3000);
		WebElement chkBoxLogin = driver.findElement(By.id("chkLogin"));
		Thread.sleep(3000);
		chkBoxLogin.click();
		if (chkBoxLogin.isSelected()) {
			System.out.println("Check Box is Selected----> Test Pass");
			WebElement userName = driver.findElement(By.id("user_name"));
			if (userName.isDisplayed()) {
				System.out.println("User Name is Displayed----> Test Pass");
				Thread.sleep(3000);
				userName.sendKeys("Raj Kumar");
				WebElement userPassword = driver.findElement(By.id("user_password"));
				if (userPassword.isDisplayed()) {
					System.out.println("User Password is Displayed----> Test Pass");
					Thread.sleep(3000);
					userPassword.sendKeys("RajTest@123");
					WebElement rePassword = driver.findElement(By.id("re_password"));
					if (rePassword.isDisplayed()) {
						System.out.println("Confirm Password is Displayed----> Test Pass");
						Thread.sleep(3000);
						rePassword.sendKeys("RajTest@123");
						WebElement dropdown = driver.findElement(By.id("status")); 
						if(dropdown.isDisplayed()) {
							System.out.println("Dropdown Status is Displayed----> Test Pass");
							Select dropDown = new Select(dropdown);
							Thread.sleep(3000);
							dropDown.selectByVisibleText("Enabled");
							driver.findElement(By.id("btnSave")).click();
						}
						else {
							System.out.println("Dropdown Status is not Displayed----> Test Fail");
						}
					}
					else {
						System.out.println("User Password is not Displayed----> Test Fail");
					}
				}
				else {
					System.out.println("User Password is not Displayed----> Test Fail");
				}
			}else {
				System.out.println("User Name is not Displayed----> Test Fail");
			}
		}
		else {
			System.out.println("Check Box is not Selected----> Test fail");
		}
		
	}

}
