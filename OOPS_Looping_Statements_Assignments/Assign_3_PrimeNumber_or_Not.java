package OOPS_Looping_Statements_Assignments;

public class Assign_3_PrimeNumber_or_Not {

	public static void main(String[] args) {
		int num = 23;
		boolean flag = false;
		for (int i =2; i <= num/2; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}
		}
		if (!flag)
			System.out.println(num + " is a prime number.");
		else {
			System.out.println(num + " is not a prime number.");
		}
		
		
		
		//By Using While loop
		int num1 = 23;
		int i1 = 2;
		boolean flag1 = false;
		while(num1 % i1 == 0) {
			if (num1 % i1 == 0) {
				flag1 = true;
				break;
			}
		}
		if (!flag1)
			System.out.println(num1 + " is a prime number.");
		else {
			System.out.println(num1 + " is not a prime number.");
		}
	}

}
