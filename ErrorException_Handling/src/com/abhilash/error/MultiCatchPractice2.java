package com.abhilash.error;

public class MultiCatchPractice2 {
    public static void main(String[] args) {
        String[] entries = {"12", "many", "-3"};

        for (String entry : entries) {
            try {
                int quantity = parseQuantity(entry);
                System.out.println("Accepted quantity: " + quantity);
            } catch (NumberFormatException e) {
                System.out.println("Rejected " + entry + ": not an integer");
            } catch (IllegalArgumentException e) {
                // TODO: print the too-small rejection
                System.out.println("Rejected " + entry + ": quantity must be at least 1");
            }
        }
    }

    static int parseQuantity(String text) {
        int quantity = Integer.parseInt(text);
        if (quantity < 1) {
            throw new IllegalArgumentException("quantity must be at least 1");
        }
        return quantity;
    }
}
