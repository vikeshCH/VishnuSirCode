package javabasics_Part1;

public class Swap2NumWithUsing3rdVariable {
	 static int  a = 50;
	 static int b = 60;
	 static int c;
	public static void main(String[] args) {
		c = a;
		a = b;
		b = c;
		System.out.println("Before Swap a="+ a+ " b="+b);
		System.out.println("After Swap a="+ a+ " b="+b);
	}
	
}
