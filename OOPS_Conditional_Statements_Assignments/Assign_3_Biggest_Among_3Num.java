package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class Assign_3_Biggest_Among_3Num {
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter Number 1");
			int num1 = in.nextInt();
			
			try (Scanner in1 = new Scanner(System.in)) {
				System.out.println("Enter Number 2");

				int num2 = in1.nextInt();
				
				try (Scanner in2 = new Scanner(System.in)) {
					System.out.println("Enter Number 3");
					int num3 = in2.nextInt();
					
					if(num1 > num2)
						if(num1 > num3)
							System.out.println("the greatest is : "+num1);
					
					if(num2 > num1)
						if(num2 > num3)
							
							System.out.println("the greatest is : "+num2);
					if(num3 > num1)
						if(num3 > num2)
							
							System.out.println("the greatest is : "+num3);
				}
			}
		}
	}
}
