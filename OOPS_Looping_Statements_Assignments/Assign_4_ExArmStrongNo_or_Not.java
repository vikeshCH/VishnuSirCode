package OOPS_Looping_Statements_Assignments;

import java.util.Scanner;

public class Assign_4_ExArmStrongNo_or_Not {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter any Integer Number:");
			int n = in.nextInt();
			int temp = n,sum = 0;
			int r;
			while (n > 0) {		
				r = n%10;
				sum = sum+(r * r * r);
				n = n/10;	
			} 
			if (sum==temp)
				System.out.println("Given Number is a ArmStrong Number");
			else
				System.out.println("Given Number is not a ArmStrong Number");
		}	
	}
}
