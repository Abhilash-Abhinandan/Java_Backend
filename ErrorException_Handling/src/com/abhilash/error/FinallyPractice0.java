package com.abhilash.error;

public class FinallyPractice0 {
    public static void main(String[] args) {
        System.out.println("checkout started");

        try {
            System.out.println("checking coupon SAVE50");
            // TODO: throw IllegalArgumentException with message "expired coupon SAVE50"
            throw new IllegalArgumentException("expired coupon SAVE50");
        } catch (IllegalArgumentException e) {
            System.out.println("caught coupon problem: " + e.getMessage());
        } finally {
            // TODO: print "record coupon audit"
        	System.out.println("record coupon audit");
        }

        System.out.println("checkout continues");
    }
}
