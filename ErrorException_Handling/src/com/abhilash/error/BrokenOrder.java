package com.abhilash.error;

// Broken order of catch block
public class BrokenOrder {
    public static void main(String[] args) {
        String priceText = "not-a-number";
        try {
            double price = Double.parseDouble(priceText);
            System.out.println(price);
        } catch (Exception e) {
            System.out.println("General failure.");
        } catch (NumberFormatException e) {
            System.out.println("Bad price format.");
        }
    }
    
    // If the Exception is in the top then after that we can not handle any specific exceptions because the Exception 
    // is the top of the branch (Throwable -> Exception -> RuntimeException)
    // So the jvm will not reach to the specific handler and compiler will show us error.
}