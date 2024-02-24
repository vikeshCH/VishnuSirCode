package POM;

import org.junit.Test;

public class LoginTest extends BaseTest{
	
	@Test
	public void VerifyLoginWithValidCredentials() {
		LaunchBrowser();
		LaunchApplication();
		LoginPage login = new LoginPage(driver);
		login.login("dfgdfg", "dfgdgdsg");
		login.verifyLoginErrorMessage("Invalid credentials");
		login.CloseBrowser();
	}
	
	@Test
	public void VerifyCopyRightFooterMsg() {
		LaunchBrowser();
		LaunchApplication();
		LoginPage login = new LoginPage(driver);
		login.login("dfgdfg", "dfgdgdsg");
		login.footerCopyWriteMsg("\r\n" + "© 2005 - 2023 ");
		login.CloseBrowser();
	}
	
}
