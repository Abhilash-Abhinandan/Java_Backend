package com.abhilash.error;

public class AveragePrice {
    public static void main(String[] args) {
        double cartTotal = 89.97;
        int itemCount = 0;

        try {
            System.out.println("Before division");
            double average = cartTotal / itemCount;
            System.out.println("Average: $" + average);
            System.out.println("After division");
        } catch (ArithmeticException e) {
            System.out.println("Can't compute average for an empty cart.");
        }

        System.out.println("Program continues.");
    }
}