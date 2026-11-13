package com.abhilash.error;

public class CartCheckout {
    public static void main(String[] args) {
        System.out.println("Cart contents: 1 item at $29.99");
        checkout(0);
        System.out.println("This line never runs.");
    }

    public static void checkout(int itemCount) {
        System.out.println("Starting checkout.");
        verifyCart(itemCount);
        System.out.println("Checkout completed.");
    }

    public static void verifyCart(int itemCount) {
        if (itemCount <= 0) {
            throw new IllegalStateException(
                "Cannot check out with " + itemCount + " items in the cart."
            );
        }
        System.out.println("Cart verified with " + itemCount + " items.");
    }
}