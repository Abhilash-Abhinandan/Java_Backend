package com.abhilash.error;

// Fixed order of catch block
public class FixedOrder {
    public static void main(String[] args) {
        String priceText = "not-a-number";
        try {
            double price = Double.parseDouble(priceText);
            System.out.println(price);
        } catch (NumberFormatException e) {
            System.out.println("Bad price format.");
        } catch (Exception e) {
            System.out.println("General failure.");
        }
        
        // put the most specific type first. Now the specific handler is reachable.
        // NumberFormatException matches first and runs. The Exception catch acts as a fallback for any other kind of exception the try block might produce.
    }
}