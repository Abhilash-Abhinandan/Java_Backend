package com.abhilash.error;

public class ThrowableFields1 {

    public static void main(String[] args) {

        try {

            try {
                Integer.parseInt("not-a-number");

            } catch (NumberFormatException e) {

                throw new IllegalArgumentException(
                    "Invalid user input", e
                );
            }

        } catch (IllegalArgumentException err) {

            System.out.println("Message: " + err.getMessage());

            System.out.println("Class: " + err.getClass().getName());

            System.out.println("Cause: " + err.getCause());

            System.out.println("Cause Class: " +
                err.getCause().getClass().getName());
        }
    }
}