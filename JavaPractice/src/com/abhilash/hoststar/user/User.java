package com.abhilash.hoststar.user;

public class User {
	private String userId;
	private String userName;
	private String userType;
	
	public static int liveUserCount = 0;
	
	public User(String _userName, String _userType) {
		this.userName = _userName;
		this.userType = _userType;
	}
	
	public User(String _userId, String _userName, String _userType) {
		this.userId = _userId;
		this.userName = _userName;
		this.userType = _userType;
	}
	
	{
		liveUserCount += 1;
	}
}
