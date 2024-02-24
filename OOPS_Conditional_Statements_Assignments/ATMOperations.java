package OOPS_Conditional_Statements_Assignments;

import java.util.Scanner;

public class ATMOperations {

	public static void main(String[] args) {
		ATMOperations op = new ATMOperations();
		int atmpin = 1234;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Welcome to your bank Account !!!");
			while (true) {
				System.out.println("\n1.ViewBalance\n2.WithdrawAmount\n3.DepositeAmount\n4.ViewMiniStatement\n5.Exit\n");
				System.out.println("Enter choice : ");
				int ch = in.nextInt();

				if (ch == 1) {
					System.out.println("Enter ATM Pin: ");
					int pin = in.nextInt();
					if (atmpin == pin) {
						System.out.println("Account Authorized!\n");
						op.viewBalance();
					} else {
						System.out.println("Incorrect ATM pin:");
						System.exit(0);
					}
				} else if (ch == 2) {
					System.out.println("Enter ATM Pin: ");
					int pin = in.nextInt();
					if (atmpin == pin) {
						System.out.println("Account Authorized!\n");
						System.out.println("Enter Amount to withdrawl");
						double withdrawAmount = in.nextDouble();
						op.withdrawAmount(withdrawAmount);
					} else {
						System.out.println("Incorrect ATM pin:");
						System.exit(0);
					}
				} else if (ch == 3) {
					System.out.println("Enter ATM Pin: ");
					int pin = in.nextInt();
					if (atmpin == pin) {
						System.out.println("Account Authorized!\n");
						System.out.println("Enter Amount to Deposite");
						double depositAmount = in.nextDouble();
						op.depositAmount(depositAmount);
					} else {
						System.out.println("Incorrect ATM pin:");
						System.exit(0);
					}
				} else if (ch == 4) {
					System.out.println("Enter ATM Pin: ");
					int pin = in.nextInt();
					if (atmpin == pin) {
						System.out.println("Account Authorized!\n");
						System.out.println("MIni Statement");
						System.out.println("************");
						double miniStmt = in.nextDouble();
						op.miniStmt(miniStmt);
					} else {
						System.out.println("Incorrect ATM pin:");
						System.exit(0);
					}
				} else if (ch == 5) {
					System.out.println("Collect your ATM Card\n,Thank you for using ATM Machine!!");
					System.exit(0);
				} else {
					System.out.println("Please Enter Valid Choice");
				}
			}
		}
		
	}

	private void miniStmt(double miniStmt) {
		// TODO Auto-generated method stub
		
	}

	private void depositAmount(double depositAmount) {
		// TODO Auto-generated method stub
		
	}

	private void withdrawAmount(double withdrawAmount) {
		// TODO Auto-generated method stub
		
	}

	private void viewBalance() {
		// TODO Auto-generated method stub
		
	}



}
