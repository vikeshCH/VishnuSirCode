package WebDriverAdvanced;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class GridExecution {

	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = null;
		String browserName = "chrome";
		String hubUrl = "http://192.168.123.216:4444/wd/hub";
		if (browserName.equalsIgnoreCase("chrome")) {
			DesiredCapabilities capability = new DesiredCapabilities();
			capability.setBrowserName("chrome");
			capability.setPlatform(Platform.WINDOWS);
			driver = new RemoteWebDriver(new URL(hubUrl), capability);
		}
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login");
	}

}
