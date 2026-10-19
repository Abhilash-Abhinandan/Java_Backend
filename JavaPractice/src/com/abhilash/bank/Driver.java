package com.abhilash.bank;

public class Driver {
	public static void main(String args[]) {
		BankUser bankUser = new BankUser("Abhilash", "3434343434", 200000);
		bankUser.doTransfer(1);
		System.out.println(bankUser.getBalance());
	}
}
