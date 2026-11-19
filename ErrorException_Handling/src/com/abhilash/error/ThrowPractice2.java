package com.abhilash.error;

public class ThrowPractice2 {
    public static void main(String[] args) {
        printUser("  RIVER_9 ");
        printUser(null);
    }

    static void printUser(String username) {
        try {
            System.out.println("User: " + normalizeUsername(username));
        } catch (NullPointerException e) {
            System.out.println("Missing: " + e.getMessage());
        }
    }

    static String normalizeUsername(String username) {
    	if(username == null) {
    		throw new NullPointerException("username is required");
    	}
    	
        return username.trim().toLowerCase();
    }
}