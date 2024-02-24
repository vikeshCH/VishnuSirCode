package LogoutLink_Click_In_OHRMApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click_On_Logout_link_In_OHRMApplication {
	static WebDriver driver;
	static String applicationUrl = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";

	public void loginFunctionality() {
		WebElement userName = driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		System.out.println("Entered UserName in the TextBox :- Admin");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Vikesh@123.com");
		System.out.println("Entered Password in the TextBox :- Vikesh@123.com");

		WebElement loginButton = driver.findElement(By.id("btnLogin"));
		loginButton.click();
		System.out.println("Clicked on Login Button");
		System.out.println("**** Successfully Login to HomePage Of OHRM Apllication ********");

	}

	public void ClickOnWelComeAdmin() throws InterruptedException {
		// id = welcome
		WebElement welcome = driver.findElement(By.id("welcome"));
		welcome.click();
		System.out.println("Clicked on Logout link");

         //		System.out.println("Clicked on welcome Admin Web-Element");
         //		WebElement logout = driver.findElement(By.partialLinkText("Logout")); 
         //		logout.click();
        //		System.out.println("Clicked on Logout link");
        //		System.out.println("******* LoggedOut Suceessfully Navigated to OHRM Login Page");

		// Synchronization - making the WebDriver to Hault for some duration so that
        //      The Element of the WebPage is going to be Loaded

        Thread.sleep(5000);

        //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
        //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>

		By logOutProperty = By.linkText("Logout");
		WebElement logOut = driver.findElement(logOutProperty);
		logOut.click();
		System.out.println("******* LoggedOut Suceessfully Navigated to OHRM Login Page");


	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(applicationUrl);

		Click_On_Logout_link_In_OHRMApplication login = new Click_On_Logout_link_In_OHRMApplication();
		login.loginFunctionality();
		login.ClickOnWelComeAdmin();
	}
}
