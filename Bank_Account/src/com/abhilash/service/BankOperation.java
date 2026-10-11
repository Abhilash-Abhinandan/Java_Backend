package com.abhilash.service;

import com.abhilash.model.BankAccountDetails;

public class BankOperation {
	BankAccountDetails details = new BankAccountDetails(343434343, "Abhilash", 15000000, "SBI");
	
	public double doDeposit(double depositAmount) {
		if(depositAmount <= 0) throw new IllegalArgumentException("Deposite amount must be +ve");
		if(details  == null) throw new IllegalArgumentException("Account details not initialized");
		
		double newBalance = details.getBalance() + depositAmount;
		return newBalance;
	}
			
	public void doWithdraw(double withdrawAmount) {
		double currentBalance = details.getBalance();
		details.setBalance(currentBalance - withdrawAmount);
	}
}
// I need to fix this there is some issue here!