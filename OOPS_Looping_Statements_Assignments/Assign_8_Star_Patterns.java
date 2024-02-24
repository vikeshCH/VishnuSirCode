package OOPS_Looping_Statements_Assignments;

public class Assign_8_Star_Patterns {

	public static void printPattern(int n) {
		int i,j;
		for(j = 0; j < n; j++) {
			for (i = 0; i < n; i++) {
				if (j==0 || i==0 || j== n-1 || i == n-1) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System .out.println();
		}
		System .out.println("______________");
	}
	
	
	public static void printPattern1(int n) {
		int i,j;
		for(j = 0; j <= n; j++) {
			for (i = 0; i < j; i++) {
				System.out.print("* ");
			}
			System .out.println();
		}
		System .out.println("______________");
	}
	public static void printPattern12(int n) {
		int i,j;
		for(j = 0; j <= n; j++) {
			for (i = 0; i < j; i++) {
				System.out.print("*");
			}
			System .out.println();
		}
		System .out.println("______________");
	}
	public static void printPattern2(int n) {
		int i,j;
		for(j = n; j >= 1; j--) {
			for (i = 1; i <= j; i++) {
				System.out.print("* ");
			}
			System .out.println();
		}
		System .out.println("______________");
	}
	
	
	public static void printPattern3(int n) {
		int i,j;
		for(j = 0; j < 6-1; j++) {
			for (i = 0; i <= j; i++) {
				System.out.print("*"+" ");
			}
			System .out.println(" ");
		}
		System .out.println("______________");
		for(j = 6-1; j >= 0; j--) {
			for (i = 0; i <= j-1; i++) {
				System.out.print("*"+" ");
			}
			System .out.println(" ");
		}
	}
	public static void main(String[] args) {
		int n = 5;
		printPattern(n);
		printPattern1(n);
		printPattern12(n);
		printPattern2(n);
		printPattern3(n);
	}
	
	
	

}
