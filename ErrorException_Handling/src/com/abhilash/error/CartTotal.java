package com.abhilash.error;

public class CartTotal {
    public static int sum(int[] prices) {
        try {
            int total = 0;
            for (int price : prices) {
                total += price;
            }
            return total;
        } finally {
            System.out.println("sum cleanup done");
        }
    }

    public static void main(String[] args) {
        int[] cart = {10, 20, 30};
        System.out.println("cart total: " + sum(cart));
    }
}

// Do not return in finally block just do clean up here this is the correct 