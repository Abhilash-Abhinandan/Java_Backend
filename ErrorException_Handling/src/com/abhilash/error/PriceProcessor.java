package com.abhilash.error;

// Multiple catch blocks
public class PriceProcessor {
    public static void main(String[] args) {
        String[] cartPrices = {"19.99", "29.50", "9.99"};
        int requestedSlot = 5;

        try {
            String rawPrice = cartPrices[requestedSlot];
            double price = Double.parseDouble(rawPrice);
            int unitsPerBox = 0;
            double pricePerUnit = price / unitsPerBox;
            System.out.println("Price per unit: " + pricePerUnit);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Cart slot " + requestedSlot + " does not exist. Pick a slot between 0 and 2.");
        } catch (NumberFormatException e) {
            System.out.println("That price isn't a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Units per box can't be zero.");
        }
    }
}