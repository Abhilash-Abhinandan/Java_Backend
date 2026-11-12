package com.abhilash.error;

public class CheckoutFlow {
    public static void main(String[] args) {
        System.out.println("Starting checkout.");
        
        try {
        	placeOrder("ORD-1001", "1234abcd");
        	System.out.println("Checkout Finished!");
        } catch(Exception err) {
        	System.out.println(err.getMessage());
        }
    }

    public static void placeOrder(String orderId, String cardNumber) {
        System.out.println("Placing order " + orderId);
        chargeCard(cardNumber);
        System.out.println("Order placed.");
    }

    public static void chargeCard(String cardNumber) {
        System.out.println("Charging card.");
        validateCardNumber(cardNumber);
        System.out.println("Charge complete.");
    }

    public static void validateCardNumber(String cardNumber) {
        for (int i = 0; i < cardNumber.length(); i++) {
            char c = cardNumber.charAt(i);
            if (c < '0' || c > '9') {
                throw new IllegalArgumentException(
                    "Card number must be digits only, got '" + cardNumber + "'"
                );
            }
        }
    }
}