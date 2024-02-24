package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class Assign_7_Restaurent_Menu {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter Your Choice in Menu List");
			int choice = input.nextInt();
			while (choice >= 0 && choice <=6 ) {
				System.out.println("Main Menu");
				System.out.println("1.Tiffins");
				System.out.println("2.Veg-items");
				System.out.println("3.Non-Veg-Items");
				System.out.println("4.Starters");
				System.out.println("5.Snacks");
				System.out.println("6.Exit");
				switch (choice) {
				case 1:
					System.out.println("Dosa");
					break;
				case 2:
					System.out.println("Mullakkada Pulusu");
					break;
				case 3:
					System.out.println("Chicken Dum-Biriyani");
					break;
				case 4:
					System.out.println("Allu Samosa");
					break;
				case 5:
					System.out.println("Fruit Salad");
					break;
				case 6:
					System.out.println("I Don't like any Options");
					break;

				default:
					System.out.println("You Choose Invalid Choice, Enter Valid");
					break;
				}
				System.out.println("My choice"+choice);
				break;
			}
		}
	}
}
