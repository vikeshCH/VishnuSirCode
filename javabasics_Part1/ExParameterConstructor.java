package javabasics_Part1;

public class ExParameterConstructor 
{
	static String a;
	int empId;
	String empName;
	double sal;
	
	//parameterized constructor
	ExParameterConstructor(String a1,int id1,String name1,double sal1)
	
	{
		a = a1;
		empId = id1;
		empName = name1;
		sal = sal1;
	}
	
	void display() {
		System.out.println("Employee Organisation is: "+a);
		System.out.println("Employee id is: "+empId);
		System.out.println("Employee Name is: "+empName);
		System.out.println("Employee Salary is: "+sal);
		
		
	}
	
	public static void main(String args[]) {	
		  ExParameterConstructor vikesh = new ExParameterConstructor("Live Tech Foundation",101,"Vikesh",98988.55);
	      vikesh.display();
		  ExParameterConstructor ravi = new ExParameterConstructor("Live Tech Foundation",102,"Ravi",36976.66);
		  ravi.display();
	}

}
