package com.abhilash.hoststar.driver;

import com.abhilash.hoststar.user.User;

public class Driver {
	public static void main(String args[]) {
		for(int count = 0; count < 100; count++) {
			User user = new User("Guest", "Free");
		}
		
		System.out.println(User.liveUserCount);
	}
}
