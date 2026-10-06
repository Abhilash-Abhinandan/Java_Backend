package com.abhilash.constructors4;

public class User {
	String name;
	String type;
	String country;
	
	public User() {
		this("Guest", "guest_user", "IND");
	}

	public User(String _name, String _type, String _country) {
		this.name = _name;
		this.type = _type;
		this.country = _country;
	}
}
 