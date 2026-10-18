package com.abhilash.hoststar.driver;

import com.abhilash.hoststar.user.User;

public class Driver {
	public static void main(String args[]) {
		User user = new User("Guest", "Free");
		
		System.out.println(User.liveUserCount);
	}
}
