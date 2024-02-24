package OOPS_Concepts_Part1;

public class Bank {
	static int currentBalance = 1000;
	static void greetCustomer() {
		System.out.println("Hello, Welcome to the banking Application");
	}
	public void deposite(int amount) {
		currentBalance = currentBalance + amount;
		System.out.println("Amount is deposited Successfully");
	}
	public static void withdrawl(int amount) {
		currentBalance = currentBalance - amount;
		System.out.println("Amount is withdrawl Successfully");
	}
	public int getCurrentBalance() {
		return currentBalance;
	}

	public static void main(String[] args) {
		Bank bank = new Bank();
		greetCustomer();
		System.out.println("Current Balance is:"+ bank.getCurrentBalance());
		bank.deposite(500);
		System.out.println("Current Balance is:"+ bank.getCurrentBalance());
		withdrawl(300);
		System.out.println("Current Balance is:"+ bank.getCurrentBalance());
	}

}
