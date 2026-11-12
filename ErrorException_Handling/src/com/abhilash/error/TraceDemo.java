package com.abhilash.error;

// Learning how to read stack trace
public class TraceDemo {
    public static void main(String[] args) {
        String coupon = null;
        applyCoupon(coupon);
    }

    public static void applyCoupon(String coupon) {
        int discountPercent = parsePercent(coupon);
        System.out.println("Discount: " + discountPercent + "%");
    }

    public static int parsePercent(String coupon) {
        return Integer.parseInt(coupon);
    }
}