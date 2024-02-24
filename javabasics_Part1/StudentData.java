package javabasics_Part1;

public class StudentData {
	public static void main(String[] args) {
		int stuId = 123;
		String stuName = "Vikesh";
		String address = "Ameerpet";
		char gender = 'M';
		long phoneNum = 9987889889L;
		byte sub1 = 95;
		byte sub2 = 98;
		byte sub3 = 96;
		int total;
		total = sub1 + sub2 + sub3;
		float avg;
		avg = total/2;
		System.out.println("Student Id Is: " + stuId);
		System.out.println("Student Name Is: "+ stuName);
		System.out.println("Student Address Is: "+ address);
		System.out.println("Student Gender Is: " + gender);
		System.out.println("Student Phone Number Is: " + phoneNum);
		System.out.println("Student Total Marks Is: " +total);
		System.out.println("Student Average Marks Is: " +avg);
		
	}

}
