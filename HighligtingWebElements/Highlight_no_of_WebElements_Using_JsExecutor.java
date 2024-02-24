package HighligtingWebElements;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_no_of_WebElements_Using_JsExecutor {
	public static WebDriver driver;
	public static void highlightWebElements() throws InterruptedException {
		driver.get("https://www.w3schools.com/");
		
		///html/body/div[2]/div[1]/nav/a[2]
		highlight(driver.findElement(By.xpath("//*[@id=\"navbtn_exercises\"]")));
		////*[@id="navbtn_services"]
		Thread.sleep(3000);

		highlight(driver.findElement(By.xpath("//*[@id=\"navbtn_services\"]")));
	}
	

	public static void highlight(WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeAsyncScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red');", element);
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Trainings\\Seleniun-Automation\\CodeBase\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Highlight_no_of_WebElements_Using_JsExecutor highlightElement = new Highlight_no_of_WebElements_Using_JsExecutor();
		highlightElement.highlightWebElements();
	}
}
