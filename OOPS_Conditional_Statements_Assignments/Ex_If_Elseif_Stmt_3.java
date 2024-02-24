package OOPS_Conditional_Statements_Assignments;

public class Ex_If_Elseif_Stmt_3 {
	public static void main(String[] args) {
		String course = "cse";
		if (course.equals("cse"))
		
		System.out.println("Join in CSE");
		
		
		else if (course.equals("ece"))
			
		
			System.out.println("Join in ECE");
		else if (course.equals("eee")) 
			System.out.println("Join in EEE");
		else if (course.equals("civil")) 
			System.out.println("Join in CIVIL");
		else if (course.equals("mechanical")) 
			System.out.println("Join in MECHANICAL");
		else
			System.out.println("Join in Degree");
		
	}
}

