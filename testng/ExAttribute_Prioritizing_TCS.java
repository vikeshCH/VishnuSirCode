package testng;

import org.testng.annotations.Test;

public class ExAttribute_Prioritizing_TCS {
	@Test(priority = 0)
	public void VerifyAddEmployee() {
		System.out.println("VerifyAddEmployee");

	}
	@Test(priority = 1)
	public void VerifyEditEmployee() {
		System.out.println("VerifyEditEmployee");

	}
	@Test(priority = 2)
	public void VerifyDeleteEmployee() {
		System.out.println("VerifyDeleteEmployee");

	}
}

