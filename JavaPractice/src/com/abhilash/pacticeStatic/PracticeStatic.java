package com.abhilash.pacticeStatic;

public class PracticeStatic {
	String userId;
	String userName;
	String userMobile;
	
	// Static block will get executed just after the class loading.
	static {
		System.out.println("I am in static inti block");
	}
	
	public PracticeStatic(String userId, String userName, String userMobile) {
		this.userId = userId;
		this.userName = userName;
		this.userMobile = userMobile;
		System.out.println("I am inside the constructor");
	}
	
}
