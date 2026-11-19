package com.abhilash.error;

public class ThrowPractice0 {
    public static void main(String[] args) {
        tryRegister(21);
        tryRegister(-4);
    }

    static void tryRegister(int age) {
        try {
            registerAge(age);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }

    static void registerAge(int age) {
    	
    	if(age <= 0) {
    		throw new IllegalArgumentException("Age cannot be negative: " + age);
    	}
    	
        System.out.println("Accepted age: " + age);
    }
}