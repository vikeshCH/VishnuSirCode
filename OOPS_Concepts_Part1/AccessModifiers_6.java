package OOPS_Concepts_Part1;

public class AccessModifiers_6 {
	protected int studentID;
	private String studentDepartment;
    public String studentName;
    public void vikesh() {
    	studentID = 123;
        studentDepartment = "livetech"; 
        studentName = "Vikesh";
        System.out.println("Student ID : "+studentID);
        System.out.println("Student Department : "+studentDepartment);
        System.out.println("Student IName : "+studentName);
    }
    public static void main(String args[]) {
    	AccessModifiers_6 print = new AccessModifiers_6();
    	print.vikesh();
    }
    
}
