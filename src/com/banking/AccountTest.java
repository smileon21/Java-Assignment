package com.banking;

public class AccountTest {

	public static void main(String[] args) {
		//Create a new account with initial balance
		Account myAccount = new Account("Dawn Mungwini",1000.00);
		 
	    System.out.println("=== BANKING SYSTEM ===");
	    System.out.println("All tranactions will be recorded in Bank.tx");
	    System.out.println("==========================================");
	    
	    
	    //initial info
	    myAccount.displayAccountInfo();
	    System.out.println();
	    
	    //Test deposit operations
	    System.out.println("1. Testing Deposit Operations:");
	    myAccount.deposit(500.00);
	    myAccount.deposit(-100.00);//Invalid deposit
	    System.out.println("Current Balance: $" + myAccount.getBalance());
	    System.out.println();
	    
	    //Test valid withdrawal
	    System.out.println("2. Testing Valid Withdrawal:");
	    myAccount.withdraw(200.00);
	    System.out.println("Current Balance: $" + myAccount.getBalance());
	    System.out.println();
	    
	    //Test withdrawal that exceeds balance 
	    System.out.println("3. Testing Withdrawal that Exceeds Balance:");
	    myAccount.withdraw(2000.00);//this should show error message
	    System.out.println("Current Balance: $" + myAccount.getBalance());
	    System.out.println();
	    
	    //Invalid withdrawal amount
	    System.out.println("4.Testing Invalid Withdrawal Amount:");
	    myAccount.withdraw(-50.00);//negative amount
	    System.out.println("Current Balance: $"+ myAccount.getBalance());
	    System.out.println();
	    
	    //Final account inforation
	    System.out.println("5. Final Account Information:");
	    myAccount.displayAccountInfo();
	    
	}
	

}
