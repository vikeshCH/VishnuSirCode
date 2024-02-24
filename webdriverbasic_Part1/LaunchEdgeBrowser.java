package webdriverbasic_Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","C:\\Trainings\\Seleniun-Automation\\Softwares\\edgedriver_win64\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		//<input name="txtUsername" id="txtUsername" type="text">
		//<input name="txtPassword" id="txtPassword" auto complete="off" type="password">
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123star");
		driver.findElement(By.className("button")).click();
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
		
	
}
