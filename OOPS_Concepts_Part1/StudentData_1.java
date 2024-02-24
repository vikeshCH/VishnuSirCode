package OOPS_Concepts_Part1;

public class StudentData_1 {
	int id;
	String name;
	int sub1;
	int sub2;
	public void display() {
		id = 123;
		name = "Vikesh";
		sub1 = 96;
		sub2 = 95;
		double marks = sub1 + sub2;
		System.out.println("Student Id : "+id);
		System.out.println("Student Name : "+name);
		System.out.println("Student Marks : "+marks);
	}
	public static void main(String[] args) {
		StudentData_1 vikesh = new StudentData_1();
		vikesh.display(); 
	}

}
