package com.abhilash.model;

public class BankAccountDetails {
	private long accountNumber;
	private String customerName;
	private double balance;
	private String bankName;
	
	public BankAccountDetails(long _accountNumber, String _customerName, double _balance, String _bankName) {
		this.accountNumber = _accountNumber;
		this.customerName = _customerName;
		this.balance = _balance;
		this.bankName = _bankName;
	}
	
	public long getAccountNumber() {
		return this.accountNumber;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double depositAmount) {
		this.balance += depositAmount;
	}
	
	public String getBankName() {
		return this.bankName;
	}
}
