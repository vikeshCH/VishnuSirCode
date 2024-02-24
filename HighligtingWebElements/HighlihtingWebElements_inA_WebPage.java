package HighligtingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HighlihtingWebElements_inA_WebPage {
	

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/");
		WebElement excerciseHighlight = driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/a[2]"));
		///html/body/div[2]/div[1]/nav/a[4]
		WebElement excerciseHighlight2 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/nav/a[4]"));

		JavascriptExecutor jsExecutor = (JavascriptExecutor)driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red');", excerciseHighlight );
		
		jsExecutor.executeScript("window.scrollBy(0,1990)");
		Thread.sleep(6000);
		jsExecutor.executeScript("window.scrollBy(0,-590)");

	}
}
