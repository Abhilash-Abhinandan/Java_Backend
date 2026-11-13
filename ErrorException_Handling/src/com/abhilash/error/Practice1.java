package com.abhilash.error;

import java.util.NoSuchElementException;

public class Practice1 {
    public static void main(String[] args) {
        printPrice("P-1001");
        printPrice("P-9999");
    }

    static void printPrice(String productId) {
        try {
            double price = getPrice(productId);
            System.out.println(productId + " price: $" + price);
        } catch (NoSuchElementException e) {
            System.out.println("Lookup failed: " + e.getMessage());
        }
    }

    static double getPrice(String productId) {
        if (productId.equals("P-1001")) {
            return 29.99;
        }
        
        if (productId.equals("P-1002")) {
            return 49.99;
        }
        // TODO: Throw new NoSuchElementException("No product with id " + productId).
        throw new NoSuchElementException("No product with id " + productId);
    }
}