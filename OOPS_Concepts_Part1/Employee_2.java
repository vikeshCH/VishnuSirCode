package OOPS_Concepts_Part1;

public class Employee_2 {
	public void display() {
		int empId = 123;
		String empName = "Vikesh";
		double empSal = 98765.66;
		char empGender = 'M';	
		String empAddress ="plot.no:- 1-272/3,3rd Floor, Arjunas Appartments , Road no.8, Jubliee Hills,Hyderabad.";
		System.out.println("Employee ID : "+empId);
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSal);
		System.out.println("Employee Gender : "+empGender);
		System.out.println("Employee Address : "+empAddress);
	}
	public static void main(String[] args) {
		
	}
}
class Employee3 {
	public static void main(String[] args) {
		Employee_2 vikesh = new Employee_2();
		vikesh.display();
	}
}
