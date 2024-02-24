package OrangeHRM_Assignmet_TestCase_Execution;

public class OrangeHRM_TestCases_Executions {

	public static void main(String[] args) {
		
		// TC_01 Verify Login With Blank password
		Login login = new Login();
		login.LaunchBrowser();
		login.LaunchApplication();
		login.login("Admin", "");
		login.VerifyLoginErrorMessage("Password cannot be empty");
		login.CloseBrowser();
		
		
		
		// TC_02 Verify login with invalid Credentials
		
		login.LaunchBrowser();
		login.LaunchApplication();
		login.login("gfsgfsg", "sdsgsgds");
		login.VerifyLoginErrorMessage("Invalid credentials");
		login.CloseBrowser();
		
		// TC_03 Verify Login With Blank password
		
		login.LaunchBrowser();
		login.LaunchApplication();
		login.login("", "Admin");
		login.VerifyLoginErrorMessage("Username cannot be empty");
		login.CloseBrowser();
		
		// TC_04 Verify Login With Blank password
		Login verifySuccessMessage = new Login();
		verifySuccessMessage.LaunchBrowser();
		verifySuccessMessage.LaunchApplication();
		verifySuccessMessage.login("Admin", "Vikesh@123star");
		verifySuccessMessage.VerifySuccessMessage("Welcome Admin");
		verifySuccessMessage.CloseBrowser();

		// TC_05 Verify Add Employee
		
		  AddEmployee addEmployee = new AddEmployee(); 
		  addEmployee.LaunchBrowser();
		  addEmployee.LaunchApplication(); addEmployee.login("Admin","Vikesh@123star");
		  addEmployee.navigateToPimModule(); addEmployee.navigateToAddEmployee();
		  String expectedEmpId = addEmployee.navigateToAddEmployeeDetails();
		  addEmployee.navigateToEmployeeList();
		  addEmployee.VerifyRecordinEmployeeTable(expectedEmpId);
		  addEmployee.CloseBrowser();
		 
		 
		// TC_06 Verify Edit Employee
		  EditEmployee editEmployee = new EditEmployee(); 
		  editEmployee.LaunchBrowser();
		  editEmployee.LaunchApplication(); 
		  addEmployee.login("Admin","Vikesh@123star");
		  editEmployee.navigateToPimModule();
		  editEmployee.navigateToAddEmployee();
		  String expectedEmpId1 = addEmployee.navigateToAddEmployeeDetails();
		  editEmployee.navigateToEmployeeList();
		  editEmployee.verifyRecordInEmployeeList(expectedEmpId1);
		  editEmployee.CloseBrowser();
		  
		  
		//TC_07 Verify Delete Employee
		  
	}

}