package WebDriver_with_Java;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Login extends BaseTest {
	@Test(invocationCount=5)
	public void verifyLoginErrorMessage(String expectedErrorMessage) {
		String actualErrorMessage = driver.findElement(By.id("spanMessage")).getText();
		if (actualErrorMessage.equals(expectedErrorMessage)) {
			System.out.println("Verify Error Message: Expected: " + expectedErrorMessage + " Actual: "+actualErrorMessage+"-----> Test Pass");
		}
		else {
			System.out.println("Verify Error Message: Expected: " + expectedErrorMessage + " Actual: "+actualErrorMessage+"-----> Test Fail");

		}
	}
}
