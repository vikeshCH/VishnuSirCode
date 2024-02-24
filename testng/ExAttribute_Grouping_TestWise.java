package testng;

import org.testng.annotations.Test;

public class ExAttribute_Grouping_TestWise {
	@Test(groups = {"smoke"})
	public void addAdmin() {
		System.out.println("");
	}
	
	@Test(groups = {"smoke"})
	public void addJobTilte() {
		System.out.println("");
	}
	
	@Test(groups = {"smoke"})
	public void addPayGrades() {
		System.out.println("");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void addEmployee() {
		System.out.println("");
	}
	
	@Test(groups = {"regression"})
	public void editEmployee() {
		System.out.println("");
	}
	
	@Test(groups = {"regression"})
	public void deleteEmployee() {
		System.out.println("");
	}
}
