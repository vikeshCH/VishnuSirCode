package OOPS_Looping_Statements_Assignments;

import java.util.Scanner;

public class Assign_6_Palidrome_or_Not {

	public static void main(String[] args) {
		int r,sum = 0,temp;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter any Number");
			int  n = in.nextInt();
			temp = n;
			while (n>0) {
				r = n%10;
				sum = (sum * 10) + r;
				n = n/10;
			}
		}
		if (temp == sum)
			System.out.println("Palidrome Number");
		else
			System.out.println("Not a Palidrone");
			
		
		/// Another Way of Writing a Program
		
		String original = "MADAM", reverse = "";
		
		
		int length = original.length();
		for(int i1 = length-1; i1 >=0; i1--)
			reverse = reverse + original.charAt(i1);
		if(original.equals(reverse))
			System.out.println("Enter String number is a palidrome.");
		else {
			System.out.println("Enter String is not a palidrome.");
		
	}
	}
}
