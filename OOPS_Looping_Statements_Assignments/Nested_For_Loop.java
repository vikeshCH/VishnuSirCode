package OOPS_Looping_Statements_Assignments;


public class Nested_For_Loop {
	public static void main(String[] args) {
		for (int j = 1; j<=5; j++) {
			for (int i = 1; i<=j; i++) {
				System.out.print(j+" ");
			}	
			System.out.println();
		}
		
	}
}
