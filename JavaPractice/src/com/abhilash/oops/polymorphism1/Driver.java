package com.abhilash.oops.polymorphism1;

class User {
	
}

class AdminUser extends User {
	
}

class Financeuser extends User {
	
}

public class Driver {
	public static void main(String args[]) {
		User user = new User();
		User user1 = new AdminUser();
		User user2 = new Financeuser();
	}
}
