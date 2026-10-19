package com.abhilash.bank;

public class BankUser {
	private final String accountHolderName;
	private final String accountNumber;
	private double balance;
	
	public BankUser(String accountHolderName, String accountNumber, double balance) {
		if(accountHolderName == null || accountHolderName.isBlank())
			throw new IllegalArgumentException("Account holder name should not be empty");
		
		if(accountNumber == null || accountNumber.isBlank())
			throw new IllegalArgumentException("Account number should not be empty");
		
		if(balance < 0) 
			throw new IllegalArgumentException("Balance must not be -ve");
		
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	// Operations
	public void doTransfer(double amount) {
		if(amount < 0) {
			throw new IllegalArgumentException("Transfer amount should be more that 0");
		}
		
		if(amount > balance) {
			throw new IllegalArgumentException("Transfer amount should not exceeds total balance");
		}
		
		balance -= amount;
	}
	
	
	// Getters
	public double getBalance() {
		return balance;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
}
