package javabasics_Part1;

public class Swapping2NumWithoutUsing3rdVariable {
	public static void main(String args[]) {
		int a = 10;
		int b = 20;
		System.out.println("Before Swap a="+ a+ " b="+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap a="+ a+ " b="+b);
	}

}
