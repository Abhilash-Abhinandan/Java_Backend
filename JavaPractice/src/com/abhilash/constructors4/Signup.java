package com.abhilash.constructors4;

public class Signup {
	public void doSignUp() {
//		User user1 = new User();
//		System.out.println(user1.type);
		User user2 = new User("Abhilash", "Super_Admin", "IN");
		System.out.println(user2.type);
	}
} 
