package com.abhilash.error;

public class MultiCatchPractice1 {
    public static void main(String[] args) {
        String[] priceTexts = {"1200", "free", null, "900"};
        int[] units = {3, 2, 1, 0};

        for (int slot = 0; slot < priceTexts.length; slot++) {
            try {
                String cleaned = priceTexts[slot].trim();
                int cents = Integer.parseInt(cleaned);
                int centsPerUnit = cents / units[slot];
                System.out.println("Slot " + slot + ": " + centsPerUnit + " cents per unit");
            } catch (NumberFormatException e) {
                // TODO: print the non-numeric text message
                System.out.println("Slot " + slot + ": " + "price text is not numeric");
            } catch (NullPointerException e) {
                System.out.println("Slot " + slot + ": " + "price text is missing");
            } catch (ArithmeticException e) {
                System.out.println("Slot " + slot + ": " + "units cannot be zero");
            }
        }
    }
}
