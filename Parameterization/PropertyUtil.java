package Parameterization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertyUtil {

	static Properties prop;
	
	static String browserName;


	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Trainings\\Seleniun-Automation\\CodeBase\\Resources\\Config.properties");
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);
		String myBrowser = prop.getProperty("browserName");
		String myURL = prop.getProperty("url");

		System.out.println(myBrowser);
		System.out.println(myURL);

		if (myBrowser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Trainings\\Seleniun-Automation\\Softwares\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();

			driver.get(myURL);
		} else if (myBrowser.equals("edge")) {
			System.setProperty("webdriver.edge.driver",
					"C:\\Trainings\\Seleniun-Automation\\Softwares\\edgedriver_win64\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			driver.manage().window().maximize();

			driver.get(myURL);

		} else if (myBrowser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Trainings\\Seleniun-Automation\\Softwares\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();

			driver.get(myURL);

			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

			driver.findElement(By.className("button")).click();
			;

			driver.findElement(By.partialLinkText("Welcome")).click();
			driver.findElement(By.linkText("Logout")).click();
		}

	}
}
