package OOPS_Concepts_Part1;

public class AccessMethodin2ndClass_4 {
	static int a = 10;
	static int b = 20;
	static int c = a + b;
	public static void main(String args[]) {
		System.out.println(c);
	}
}
class AccessMethodin2ndClass2 {
	public static void main(String[] args) {
		System.out.println(AccessMethodin2ndClass_4.c);
	}
}