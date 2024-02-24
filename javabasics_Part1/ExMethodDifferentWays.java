package javabasics_Part1;

public class ExMethodDifferentWays {
	// Method with out parameters  and without return values
	public void additionWOPWOR()
	{
		int a = 10;
		int b = 20;
		int c;
		c = a+b;
		System.out.println("return of c (WOPWOR) :" +c);	
	}
	// Method with parameters and without return values
	public void additionWPWOR(int a,int b) {
		int c;
		c = a + b;
		System.out.println("Result of c (WPWOR): "+c);
	}
	// Method with out parameters and with return values
	public int additionWOPWR()
	{
		int a = 100;
		int b = 200;
		int c;
		c = a + b;
		return c;
	}
	public int additionWPWR(int a,int b) 
	{
		int c;
		c = a + b;
		return c;
	}
	public static void main(String args[])
	{
		ExMethodDifferentWays obj = new ExMethodDifferentWays();
		obj.additionWOPWOR();
		obj.additionWPWOR(30,40);
		int result = obj.additionWOPWR();
		System.out.println("Result (WOPWR): " + result);
		int result1 = obj.additionWPWR(300, 400);
		System.out.println("Result (WPWR): " + result1);
	}
	

}
