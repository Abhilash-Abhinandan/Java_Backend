package com.abhilash.app1;
import com.abhilash.account.Account;

public class Main {
	public static void main(String args[]) {
		Account account = new Account();
//		account.balance;
		account.deposite(6000);
		System.out.println(account.getBalance());
	}
}
