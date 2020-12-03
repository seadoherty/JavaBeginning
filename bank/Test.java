package bank;

public class Test {

	public static void main(String[] args) {
		BankAccount acctOne = new BankAccount();
		BankAccount acctTwo = new BankAccount();
		
		acctOne.deposit("Checking", 50.00);
		acctOne.deposit("Savings", 50.00);	
		acctOne.withdrawl("Checking", 10.00);
		
		acctTwo.deposit("Checking", 13.00);		
		acctTwo.deposit("Savings", 11.00);
		acctTwo.withdrawl("Savings", 10.00);
		
		System.out.println("acctOne Checking: " + acctOne.getCheckingBalance());
		System.out.println("acctOne Savings: " + acctOne.getSavingsBalance());
		System.out.println("acctTwo Checking: " + acctTwo.getCheckingBalance());
		System.out.println("acctTwo Savings: " + acctTwo.getSavingsBalance());		
		System.out.println("Bank's Accounts: " + BankAccount.bankAccounts());
		System.out.println("All Bank's Money: " + BankAccount.totalBalance());
	}
}
