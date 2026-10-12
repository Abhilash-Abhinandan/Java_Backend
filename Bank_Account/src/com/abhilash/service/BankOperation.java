package com.abhilash.service;

import com.abhilash.model.BankAccountDetails;

public class BankOperation {
	private BankAccountDetails details;
	
	public double doDeposit(double depositAmount) {
		if(depositAmount <= 0) throw new IllegalArgumentException("Deposite amount must be +ve");
		if(this.details  == null) throw new IllegalArgumentException("Account details not initialized");
		
		double newBalance = this.details.getBalance() + depositAmount;
		this.details.setBalance(newBalance);
		return newBalance;
	}
			
	public double doWithdraw(double withdrawAmount) {
		if(withdrawAmount <= 0) throw new IllegalArgumentException("Withdraw amount must me greater than 0");
		if(this.details == null) throw new IllegalArgumentException("Account details not initialized!");
		
		double currentBalance = this.details.getBalance();
		if(withdrawAmount >  currentBalance) throw new IllegalArgumentException("Insufficent balance!");
		
		double remainingAmount = currentBalance - withdrawAmount;
		this.details.setBalance(remainingAmount);
		return remainingAmount;
	}
	
	public double checkBalance() {
		if(this.details == null) throw new IllegalArgumentException("Account details not intialized!");
		
		return this.details.getBalance();
	}
}
// I need to fix this there is some issue here!