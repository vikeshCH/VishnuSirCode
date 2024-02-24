package OOPS_Packages;

public class ExConstructorOverloading {
	int l;
	int b;
	int h;
	
	ExConstructorOverloading(int l,int b,int h){
		this.l=l;
		this.b=b;
		this.h=h;
	}
	
	ExConstructorOverloading(int value){
		this.l=value;
		this.b=value;
		this.h=value;
	}

	public void caluculateArea() {
		int area;
		area = l * b * h;
		System.out.println("Area is: " + area);
	}

	public static void main(String args[]) {

		ExConstructorOverloading cubiod = new ExConstructorOverloading(10,20,30);
		cubiod.caluculateArea();
		ExConstructorOverloading cube = new ExConstructorOverloading(10);
		cube.caluculateArea();
	}

}
