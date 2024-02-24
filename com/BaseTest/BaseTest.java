package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static WebDriver driver;
	@BeforeTest
	public void applicationLaunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println(" *********** The Application Launced Successfully ************ ");
		
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		System.out.println();
		

		// its a time out related to the Application webpage to be loaded on the Browser
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

		// elements to be identified with the given property
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterTest
	public void applicationClose() {
		driver.quit();
		System.out.println(" *********** The Application Closed Successfully ************ ");
	}
}
