package com.banking;

public abstract class Bank {
//instance variables
	protected String accountName;
	protected double balance;
	
	//Constructor
	public Bank(String accountName,double initialBalance) {
	this.accountName = accountName;
	this.balance = initialBalance;
	}
	
	//Abstract methods:implemented by subclasses
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	
	//Concrete methods
	public String getAccountName() {
		return accountName;
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Name: " + accountName);
		System.out.println("Current Balance: $" + balance);
	}
	
}
