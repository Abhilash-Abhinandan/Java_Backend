package com.abhilash.error;

public class Practice5 {
    static void validateCoupon(String code) {
        if (code.equals("SAVE50")) {
            throw new IllegalArgumentException("Coupon SAVE50 is expired");
        }
    }

    public static void main(String[] args) {
        String coupon = "SAVE50";

        // TODO: Call validateCoupon(coupon) inside a try block.
        // TODO: In the try block after the call, print "Coupon accepted".
        // TODO: Catch IllegalArgumentException as e and print "Coupon problem: " plus e.getMessage().
        
        try {
        	validateCoupon(coupon);
        	System.out.println("Coupon accepted");
        } catch (IllegalArgumentException e) {
        	System.out.println("Coupon problem: " + e.getMessage());
        }
        
        System.out.println("Checkout continues.");
    }
}