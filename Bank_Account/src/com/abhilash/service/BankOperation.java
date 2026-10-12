package com.abhilash.service;

import com.abhilash.model.BankAccountDetails;

public class BankOperation {
	private BankAccountDetails details;
	
	public BankOperation(BankAccountDetails _details) {
		if(_details == null) throw new IllegalArgumentException("Bank account details can not be null");
		
		this.details = _details;
	}
	
	public double doDeposit(double depositAmount) {
		if(depositAmount <= 0) throw new IllegalArgumentException("Deposit amount must be +ve");
		
		double newBalance = this.details.getBalance() + depositAmount;
		this.details.setBalance(newBalance);
		return newBalance;
	}
			
	public double doWithdraw(double withdrawAmount) {
		if(withdrawAmount <= 0) throw new IllegalArgumentException("Withdraw amount must be greater than 0");
		
		double currentBalance = this.details.getBalance();
		if(withdrawAmount >  currentBalance) throw new IllegalArgumentException("Insufficient balance!");
		
		double remainingAmount = currentBalance - withdrawAmount;
		this.details.setBalance(remainingAmount);
		return remainingAmount;
	}
	
	public double checkBalance() {
		
		return this.details.getBalance();
	}
	
	public void displayAccountDetails() {
		
		System.out.println(this.details.getAccountNumber());
	}
}