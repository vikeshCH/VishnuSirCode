package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseTest {

	
	@FindBy (id = "txtUsername")
	WebElement textBox_UserName;
	
	
	@FindBy (id = "txtPassword")
	WebElement textBox_Password;
	
	@FindBy (id = "btnLogin")
	WebElement textBox_Login;
	
	@FindBy (id = "spanMessage")
	WebElement errorMessage_Login;
	
	//footer xpath = //*[@id='footer']/div[1]/text()[2]
	
	@FindBy (id  = "footer")
	WebElement footerMsg_login;
	
	
	
	LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void login(String userName, String password) {
		textBox_UserName.sendKeys(userName);
		System.out.println(textBox_UserName);
		textBox_Password.sendKeys(password);
		System.out.println(textBox_Password);

		textBox_Login.click();
	}
	
	public void verifyLoginErrorMessage(String expectedErrorMessage) {
	
		String actualErrorMessage = errorMessage_Login.getText();
		if (actualErrorMessage.equals(expectedErrorMessage)) {
			System.out.println("Verify Error Message: Expected: " + expectedErrorMessage + " Actual: "+actualErrorMessage+"-----> Test Pass");
		}
		else {
			System.out.println("Verify Error Message: Expected: " + expectedErrorMessage + " Actual: "+actualErrorMessage+"-----> Test Fail");

		}
	}
	
	
	public void footerCopyWriteMsg(String expectedFooterMessage) {
		String actualFooterMessage = footerMsg_login.getText();
		System.out.println(actualFooterMessage);
		if (actualFooterMessage.equals(expectedFooterMessage)) {
			System.out.println("Verify Footer Message: Expected: " + expectedFooterMessage + " Actual: "+actualFooterMessage+"-----> Test Pass");
		}
		else {
			System.out.println("Verify Footer Message: Expected: " + expectedFooterMessage + " Actual: "+actualFooterMessage+"-----> Test Fail");

		}
	}
	
	public static void main(String[] args) {
		LoginPage obj = new LoginPage(driver);
		obj.login("Admin", "Vikesh@123.com");
		obj.verifyLoginErrorMessage("Invalid credentials");
		obj.footerCopyWriteMsg("© 2005 - 2023 ");
	}
	
}
