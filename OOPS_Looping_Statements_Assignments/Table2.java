package OOPS_Looping_Statements_Assignments;

public class Table2 {
	static int a = 40;

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++) {
			int b = i * a;
			System.out.println(a+ "*"+ i + "="+ b);
		}
	}
}
