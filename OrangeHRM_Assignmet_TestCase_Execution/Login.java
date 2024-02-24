package OrangeHRM_Assignmet_TestCase_Execution;

import org.openqa.selenium.By;

public class Login extends BaseClass {
	public void VerifyLoginErrorMessage(String expectedMessage) {
		String actualMessage = driver.findElement(By.id("spanMessage")).getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Verify Error Message : Expected: " +expectedMessage+" Actual: "+actualMessage+"---> Test Pass");
		}
		else {
			System.out.println("Verify Error Message : Expected: " +expectedMessage+" Actual: "+actualMessage+"---> Test Fail");

		}
	}
	
	public void VerifySuccessMessage(String expectedMessage) {
		String actualMessage = driver.findElement(By.xpath("//a[@id = 'welcome']")).getText();
		if (expectedMessage.equals(actualMessage)) {
			System.out.println("Verify Error Message : Expected: " +expectedMessage+" Actual: "+actualMessage+"---> Test Pass");
		}
		else {
			System.out.println("Verify Error Message : Expected: " +expectedMessage+" Actual: "+actualMessage+"---> Test Fail");

		}
	}
}

