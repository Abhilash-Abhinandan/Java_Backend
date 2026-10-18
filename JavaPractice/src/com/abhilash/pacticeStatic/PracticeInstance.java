package com.abhilash.pacticeStatic;

public class PracticeInstance {

	private static String bankAccount;
	
	public PracticeInstance(String _bankAccount) {
		this.bankAccount = _bankAccount;
	}
	
	{
		System.out.println("Inside the instance block");
	}
}
