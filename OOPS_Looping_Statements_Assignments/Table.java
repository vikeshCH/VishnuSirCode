package OOPS_Looping_Statements_Assignments;


public class Table {
	public static void main(String[] args) {
		int a = 0;
		int b = a+1;
		for(int i = 6; i <= 60; i = i+2,b++) {
			System.out.println("6 * "+(b)+" = "+ i);
		}
	}
}
