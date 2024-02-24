package OOPS_Concepts_Part1;

public class NoArgsAndParameterizedConstructors_5 {
	public int empId;
	public String empName;
	public char empGender;
	private double empSal;
	private String empAddress;
	//Parameterized Constructor
	NoArgsAndParameterizedConstructors_5(int empId1,String empName1,char empGender1,double empSalary1,String empAddress1) {
		empId = empId1;
		empName = empName1;
		empGender = empGender1;	
		empSal = empSalary1;
		empAddress = empAddress1;	
	}
	public void display1() {
		// TODO Auto-generated method stub
		System.out.println(("Employee ID : "+this.empId));
		System.out.println("Employee Name : "+this.empName);
		System.out.println("Employee Salary : "+this.empSal);
		System.out.println("Employee Gender : "+this.empGender);
		System.out.println("Employee Address : "+this.empAddress);
	}
	NoArgsAndParameterizedConstructors_5(){
		empId = 112;
		empName = "Rahul";
		empGender = 'M';
		empSal = 38455.66;
		empAddress = "Punjagutta,Hyderabad";
	}
	public void display2() {
		// TODO Auto-generated method stub
		System.out.println(("Employee ID : "+empId));
		System.out.println("Employee Name : "+empName);
		System.out.println("Employee Salary : "+empSal);
		System.out.println("Employee Gender : "+empGender);
		System.out.println("Employee Address : "+empAddress);
		
	}
	public static void main(String[] args) {
		
	}
	

}
class NoArgsAndParameterizedConstructors2 {

	public static void main(String[] args) {
		NoArgsAndParameterizedConstructors_5 print = new NoArgsAndParameterizedConstructors_5(123, "Vikesh", 'M', 98666.23, "plot.no:- 1-272/3,3rd Floor, Arjunas Appartments , Road no.8, Jubliee Hills,Hyderabad.");
		print.display1();
		NoArgsAndParameterizedConstructors_5 print2 = new NoArgsAndParameterizedConstructors_5();
		print2.display2();

	}

}




