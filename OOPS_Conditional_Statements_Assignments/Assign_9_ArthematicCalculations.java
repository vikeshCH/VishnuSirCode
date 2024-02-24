package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class Assign_9_ArthematicCalculations {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the First number : ");
			int a = in.nextInt();
			
			System.out.println("Enter the Second number : ");
			int b = in.nextInt();
			
			System.out.println("Enter the type of operation you want to perform (+, -, *, /, %)") ;
			String operation = in.next();
			
			int result = performOperation(a, b, operation);
			System.out.println("Your Answer is : "+ result);
	
		}	
	}

	private static int performOperation(int a, int b, String operation) {
		int result = 0;
		if (operation.equals("+")) {
			result = a + b;
		}
		else if(operation.equals("-")) {
			result = a - b;
		}
		else if(operation.equals("*")) {
			result = a * b;
		}
		else if(operation.equals("/")) {
			result = a / b;
		}
		else if(operation.equals("%")) {
			result = a % b;
		}
		else {
			System.out.println("Invalid Operation");
		}
		return result;
	}

}
