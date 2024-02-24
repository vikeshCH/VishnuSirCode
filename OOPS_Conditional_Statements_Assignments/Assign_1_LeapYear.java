package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class Assign_1_LeapYear {

	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the year to find out leap year or not");
			int year = in.nextInt();
			//implementing our logics
			if(year % 4 == 0) {
				System.out.println(year+"is a Leap Year");
			}
			else if(year % 100 == 0) {
				System.out.println(year+"is not a Leap Year");
			}
			else if(year % 400 == 0) {
				System.out.println(year+"is a Leap Year");
			}
			else {
				System.out.println(year+"is not a Leap Year");
			}
		}
	}

}
