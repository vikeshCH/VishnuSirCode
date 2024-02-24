package OOPS_Conditional_Statements_Assignments;

public class Ex_NestedIf_4 {
	public static void main(String[] args) {
		boolean money = true;
		boolean tickets = true;
		if (money == true) {
			if (tickets == false)
			System.out.println("Go to Movie");
			else
				System.out.println("Go to Restaurent");
		}
		else {
			System.out.println("Go to Public Park");
		}
	}
}
