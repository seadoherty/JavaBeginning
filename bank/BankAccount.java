package bank;

import java.util.Random;

public class BankAccount {
	public String accountNumber = "";
	public Double checkingBalance = 0.00;
	public Double savingsBalance = 0.00;
	public static int noAccounts;
	public static Double totalAccounts = 0.00;

	public BankAccount() {
		randAcctNo();
		noAccounts++;
	}

	public Double getCheckingBalance() {
		return checkingBalance;
	}

	public Double getSavingsBalance() {
		return savingsBalance;
	}

	public void deposit(String acct, Double amt) {
		if (acct == "Checking") {
			this.checkingBalance += amt;
			totalAccounts += amt;
		} else {
			this.savingsBalance += amt;
			totalAccounts += amt;
		}
	}

	public void withdrawl(String acct, Double amt) {
		if (acct == "Checking") {
			if (this.checkingBalance - amt > 0) {
				this.checkingBalance -= amt;
				totalAccounts -= amt;
			} else {
				System.out.println("You don't have enough funds in Checking");
			}

		} else {
			if (this.savingsBalance - amt > 0) {
				this.savingsBalance -= amt;
				totalAccounts -= amt;
			} else {
				System.out.println("You don't have enough funds in Savings");
			}
		}
	}

	public static Double totalBalance() {
		return totalAccounts;
	}
	
	public static int bankAccounts() {
		return noAccounts;
	}

	private String randAcctNo() {
		Random rand = new Random();
		int noDigits = 10;

		for (int i = 0; i < noDigits; i++) {
			int newRand = rand.nextInt(10);
			accountNumber += newRand;
		}
		return this.accountNumber;
	}
}
