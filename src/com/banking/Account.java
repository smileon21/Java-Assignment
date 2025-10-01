package com.banking;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Account extends Bank {
  
	//Constructor
	public Account(String accountName,double initialBalance) {
		super(accountName,initialBalance);//Call parent constructor
		//Record account creation
		recordTransaction("Account Created",0,initialBalance,"Initial deposit");
	}
	
	//Implement deposit method .override tells the compiler that tis method is supposed to replace a method from the parent class.
	@Override
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited: $" + amount);
			recordTransaction("Deposit",amount,balance,"Deposit successful");
		} else {
			System.out.println("Error: Deposit amount must be positive!");
			recordTransaction("Deposit Failed",amount,balance,"Invalid amount");
		}
	}
		
	//Implement withdraw method with the required validation
		@Override
		public void withdraw(double amount) {
			if (amount <= 0) {
				System.out.println("Error: Withdrawal amount must be positive!");
				 recordTransaction("WITHDRAWAL FAILED", amount, balance, "Insufficient funds");
				}else if (amount>balance) {
				System.out.println("Withdrawal amount exceeded account balance");	
				}else {
					balance -= amount;
					System.out.println("Successfully withdraw: $" + amount);
					 recordTransaction("WITHDRAWAL", amount, balance, "Withdrawal successful");
				}
		}
	 //Implement getBalance method
	  @Override
	  public double getBalance() {
		  recordTransaction("BALANCE CHECK", 0, balance, "Balance inquiry");
		  return balance;
	  }
				
//Helper method to record transactions to file
private void recordTransaction(String type, double amount, double newBalance,String description) {
	try (PrintWriter writer = new PrintWriter(new FileWriter("Bank.txt", true))){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		String timestamp = LocalDateTime.now().format(formatter);
		
		writer.println("==============================================");
		writer.println("Timestamp: " + timestamp);
		writer.println("Account:" + accountName);
		writer.println("Transaction Type:" + type);
		
		if (amount != 0) {
			writer.println("Amount; $" + amount);
		}
		writer.println("New Balance: $" + newBalance);
		writer.println("Description: " + description);
		writer.println("===========================================");
		writer.println();//empty line for readability
	}catch (IOException e) {
		System.out.println("Erro writing to transaction file:" + e.getMessage());
	}
}

//Additional method to display transaction history (otional)
public void displayTransactionSummary() {
	System.out.println("Transaction recorded in Bank.txt file");
}
}
		

