package WebDriverAdvanced;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMultipleWindows {
	public static void main(String args[]) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
		// + "\\resources\\chromedriver-win64\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);

		driver.findElement(By.xpath("//*[@id='social-icons']/a[2]/img")).click();
		String FacebookWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//*[@id='social-icons']/a[1]/img")).click();
		String linkedInWindow = driver.getWindowHandle();

		driver.findElement(By.xpath("//*[@id='social-icons']/a[4]/img")).click();
		String youTubeWindow = driver.getWindowHandle();

		Set<String> allWindows = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = allWindows.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parentWindow.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				System.out.println(child_window);
				Thread.sleep(3000);
				driver.switchTo().window(FacebookWindow);
				Thread.sleep(3000);
				driver.switchTo().window(linkedInWindow);
				Thread.sleep(3000);
				driver.switchTo().window(youTubeWindow);

			}

			/*
			 * for (String currentWindow : allWindows) { if
			 * (!currentWindow.equals(parentWindow)) {
			 * driver.switchTo().window(parentWindow); }
			 * 
			 * }
			 */
		}
		
	

		System.out.println(driver.getCurrentUrl());
	}

}
