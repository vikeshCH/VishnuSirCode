package OOPS_Looping_Statements_Assignments;


public class Assign_5_ArmStrong_btw_0_to_1000 {
	public static void main(String[] args) {
		int n,r,sum = 0;
		System.out.println("ArmStrong numbers from 1 to 1000");
		for (int i = 1; i <= 1000; i++) {
			n = i;
			while (n>0) {
				r = n%10;
				sum = sum+(r*r*r);
				n = n/10;
			}
			if (sum == i) {
				System.out.print(i+" ");
			}
			sum = 0;
		}
		
	}
}
