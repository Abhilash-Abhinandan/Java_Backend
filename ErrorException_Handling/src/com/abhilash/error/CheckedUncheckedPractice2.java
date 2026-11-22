package com.abhilash.error;

public class CheckedUncheckedPractice2 {
    public static void main(String[] args) {
        check(3);
        check(0);
    }

    static void check(int quantity) {
        try {
            int valid = validate(quantity);
            System.out.println("Accepted quantity: " + valid);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected quantity: " + e.getMessage());
        }
    }

    static int validate(int quantity) {
        if (quantity < 1) {
        	throw new IllegalArgumentException("quantity must be at least 1");
        }
        return quantity;
    }
}