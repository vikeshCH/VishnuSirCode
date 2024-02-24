package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class Assign_5_VoteEligibility {

	public static void main(String[] args) {
		int age, diff;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Age");
			age = in.nextInt();
			if (age >= 18)
				System.out.println("you are Eligible for Voting");
			else {
				diff = (18-age);
				System.out.println("Sorry, you can Vote After " + diff +" Years");
			}
		}
	}

}
