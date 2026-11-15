package com.abhilash.error;

public class MultiCatchPractice0{
    public static void main(String[] args) {
        String[] cartPrices = {"19.99", "free"};
        int[] requestedSlots = {0, 2, 1};

        for (int requestedSlot : requestedSlots) {
            try {
                String rawPrice = cartPrices[requestedSlot];
                double price = Double.parseDouble(rawPrice);
                System.out.println("Slot " + requestedSlot + " price: " + price);
            } catch (ArrayIndexOutOfBoundsException e) {
            	System.out.println("Slot " + requestedSlot + " is not available.");
            } catch (NumberFormatException e) {
                System.out.println("Slot " + requestedSlot + " has a non-numeric price.");
            }
        }
    }
}