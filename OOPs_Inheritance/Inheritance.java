package OOPs_Inheritance;

public class Inheritance {

	public static void main(String[] args) {
		Student vikesh = new Student();
		vikesh.setId(123);
		vikesh.setName("Vikesh");
		System.out.println("Student Id : " + vikesh.getId());
		System.out.println("Student Id : " + vikesh.getName());

		
		Teacher vishnu = new Teacher();
		vishnu.setId(159);
		vishnu.setName("vishnu");
		vishnu.setSal(100000);
		
		System.out.println("Teacher ID : "+ vishnu.getId());
		System.out.println("Teacher Name : "+ vishnu.getName());
		System.out.println("TEacher Salary : "+ vishnu.getSal());
		
	}

}
