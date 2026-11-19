package com.abhilash.error;

public class ThrowPractice3 {
    public static void main(String[] args) {
        printPrice(999, 3);
        printPrice(-50, 5);
        printPrice(500, 0);
    }

    static void printPrice(int totalCents, int itemCount) {
        try {
            int price = pricePerItem(totalCents, itemCount);
            System.out.println("Price per item: " + price + " cents");
        } catch (RuntimeException e) {
            System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
        }
    }

    static int pricePerItem(int totalCents, int itemCount) {
    	if(totalCents < 0) {
    		throw new IllegalArgumentException("totalCents must be non-negative: " + totalCents);
    	}
    	
    	if(itemCount <= 0) {
    		throw new ArithmeticException("itemCount must not be zero");
    	}
    	
        return totalCents / itemCount;
    }
}