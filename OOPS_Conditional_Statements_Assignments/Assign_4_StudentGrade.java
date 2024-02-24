package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class Assign_4_StudentGrade {
	public static void main(String[] args) {
		int score;
		char grade;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Your Numeric Test Score");
			score = in.nextInt();
		}
		if(score >= 90)
			grade = 'A';
		else if (score >= 80) 
			grade = 'B';
		else if (score >= 70) 
			grade = 'C';
		else if (score >= 50) 
			grade = 'D';
		else
			grade = 'F';
		
		System.out.println("Your grade is "+grade);
	}
}
