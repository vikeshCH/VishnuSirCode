package Collections;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JAvaShortCuts {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Vikesh@123.com");
		driver.findElement(By.name("Submit")).click();

		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("0100")).click();
		//driver.findElement(By.xpath("//input[@value='Add']")).click();

		//// div[@id='addEmployeeTbl']/descendant::li[2]/input
		driver.findElement(By.xpath("//div[@id='addEmployeeTbl']/descendant::li[2]/input")).sendKeys("Vikesh");
		driver.findElement(By.xpath("//div[@id='addEmployeeTbl']/child::form/descendant::li[3]/input")).sendKeys("Kumar");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).build().perform();
		action.sendKeys("King").build().perform();
		System.out.println("Successfully Changed Employee Names");

		driver.quit();

	}
}
