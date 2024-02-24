package OOPS_Looping_Statements_Assignments;

public class Assign_9_Character_Pattern {
	public static void main(String[] args) {
		int alplabet = 65;
		for(int j = 0; j<=5; j++) {
			for(int i = 0; i<=j; i++) {
				System.out.print((char)(alplabet+j));
			}
			System.out.println();
		}
		System.out.println("____________________");
		
		int alplabet1 = 65;
		for(int j = 0; j<=5; j++) {
			for(int i = 0; i<=5; i++) {
				System.out.print((char)(alplabet1+j));
			}
			System.out.println();
		}
	}

}
