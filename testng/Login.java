package testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Login {
	@Test
	public void VerifyLoginWithInvalidCredentials() {
		System.out.println("VerifyLoginWithInvalidCredentials");
	}
	@Test
	public void VerifyLoginWithvalidCredentials() {
		System.out.println("VerifyLoginWithvalidCredentials");
	}
	@Test
	public void VerifyLoginWithBlankUsername() {
		System.out.println("VerifyLoginWithBlankUsername");
	}
	


}
