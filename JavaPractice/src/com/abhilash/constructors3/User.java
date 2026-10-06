package com.abhilash.constructors3;

public class User {
	String userName;
	String userId;
	String mobile;
	
	User(String _userName, String _userId, String _mobile) {
		this("3999");
		this.userName = _userName;
//		this.userId = _userId;
		this.mobile = _mobile;
	}
	
	User(String _userId){
		this.userId = _userId;
	}
}
