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
			
	public double doWithdraw(double withdrawAmount) {
		if(withdrawAmount <= 0) throw new IllegalArgumentException("Withdraw amount must me greater than 0");
		if(details == null) throw new IllegalArgumentException("Account details not initialized!");
		
		double currentBalance = details.getBalance();
		if(withdrawAmount < currentBalance) throw new IllegalArgumentException("Insufficent balance!");
		
		double remainingAmount = currentBalance - withdrawAmount;
		details.setBalance(remainingAmount);
		return remainingAmount;
	}
	
	public double checkBalance() {
		if(details == null) throw new IllegalArgumentException("Account details not intialized!");
		
		return details.getBalance();
	}
}
// I need to fix this there is some issue here!