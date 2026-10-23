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
		
		// Parent class can refer child class object(Auto up casting);
		User user1 = new AdminUser();
		// The above line internally does like this -> Uesr user1 = (User) new AdminUser();
		// Here we do not need to right (User) . Its optional 
		
		// Bellow child class is parent object (Down casting);
		// Here down casting does not hppens automatically;
		// AdminUser ad = new User(); // Errro will show => Type mismatch: cannot convert from User to AdminUser//
		AdminUser ad = (AdminUser) new User();
	}
}
