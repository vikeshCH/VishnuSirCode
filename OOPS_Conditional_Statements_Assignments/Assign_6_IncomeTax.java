package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class Assign_6_IncomeTax {

	public static void main(String[] args) {
		double tax = 0, income;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Income");
			income = in.nextDouble();
		}
		if(income <= 200000)
			tax = 0;
		else if (income <= 300000)
			tax = 0.1 * (income -200000);
		
		else if (income <= 500000)
			tax = (0.2 * (income - 300000)) + (0.1 * (income - 200000));
		
		else if (income <= 1000000)
			tax = (0.3 * (income - 500000)) + (0.2 * (income - 300000)) + (0.1 * (income - 200000));
		else
			tax = (0.4 * (income - 1000000)) + (0.3 * (income - 500000)) + (0.2 * (income - 300000)) + (0.1 * (income - 200000));
		
		System.out.println("Income Tax Amount is : "+ tax);
	}

}
