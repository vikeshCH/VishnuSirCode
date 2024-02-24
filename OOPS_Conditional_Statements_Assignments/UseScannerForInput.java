package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class UseScannerForInput {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter any sigle integer number to get the table");
			int i = in.nextInt();
			if (i<=10)
			System.out.println("hii");

			else {
				System.out.println("Invalid Value");
			}
		}
			
	}
	
}
