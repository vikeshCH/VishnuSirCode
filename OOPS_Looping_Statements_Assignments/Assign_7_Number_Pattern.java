package OOPS_Looping_Statements_Assignments;

public class Assign_7_Number_Pattern {

	public static void main(String[] args) {
		
		System.out.println("***************");
		for (int j =1; j<=5; j++) {
			for(int i =1; i<=5; i++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("***************");
		for (int j =5; j>=1; j--) {
			for(int i =1; i<=5; i++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
        System.out.println("***************");
		
		for(int j = 1; j<=5; j++) {
			for(int i = 1; i<=5; i++) {
				System.out.print((i));
			}
			
			System.out.println();
		}
        System.out.println("***************");
        
        for(int j = 1; j<=5; j++) {
			for(int i = 1; i<=j; i++) {
				System.out.print((i));
			}
			System.out.println();
		}
        
        System.out.println("***************");
		
		for (int j =1; j<=5; j++) {
			for(int i =1; i<=j; i++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
        System.out.println("***************");
		
        
        for (int j =5; j<=1; j++) {
			for(int i =1; i<=j; i++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
        System.out.println("***************");
        
        for (int j =5; j>=1; j--) {
			for(int i =1; i<=5; i++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
        System.out.println("***************");
	}
}
