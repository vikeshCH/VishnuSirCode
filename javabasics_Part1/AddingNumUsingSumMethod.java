package javabasics_Part1;

public class AddingNumUsingSumMethod 
{
	public void sum (int a, int b)
	{
		System.out.println(a + b);
	}
	public void sum(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String args[]) 
	{
		AddingNumUsingSumMethod add = new AddingNumUsingSumMethod();
		add.sum(25, 50);
		add.sum(25, 50, 75);
	}
  
}
