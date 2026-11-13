package com.abhilash.error;

public class CartLookup {
    public static void main(String[] args) {
        String[] cart = {"Notebook", "Pen", "Eraser"};
        String slotInput = "10";

        try {
            int slot = Integer.parseInt(slotInput);
            String item = cart[slot];
            System.out.println("Item at slot " + slot + ": " + item);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Slot was out of range.");
            System.out.println("Failure type: " + e.getClass().getSimpleName());
            System.out.println("Detail: " + e.getMessage());

            try {
                String fallback = cart[0];
                System.out.println("Falling back to first item: " + fallback);
            } catch (ArrayIndexOutOfBoundsException inner) {
                System.out.println("Cart is empty, no fallback available.");
            }
        }

        System.out.println("Lookup finished.");
    }
}