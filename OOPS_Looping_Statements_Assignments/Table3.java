package OOPS_Looping_Statements_Assignments;

import java.util.Scanner;

public class Table3 {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter any integer number for Table : ");
			int n = in.nextInt();
			for(int i = 1; i <= 10; i++) {
				System.out.println(n+ "*"+ i + "="+ n*i);
			}
		}
	}
}
