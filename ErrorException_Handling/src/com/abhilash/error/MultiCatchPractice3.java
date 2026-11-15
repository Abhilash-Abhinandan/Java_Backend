package com.abhilash.error;

public class MultiCatchPractice3 {
    public static void main(String[] args) {
        String[] items = {"Mug", "Pen"};

        printLabel(items, 1, "Nora", "15");
        printLabel(items, 5, "Nora", "15");
        printLabel(items, 0, "Nora", "ten");
        printLabel(items, 0, null, "10");
    }

    static void printLabel(String[] items, int index, String customer, String discountText) {
        try {
            String item = items[index].toUpperCase();
            int discount = Integer.parseInt(discountText);
            int nameLength = customer.length();
            System.out.println("Label: " + item + " for " + customer + " (" + discount + "%, " + nameLength + " letters)");
        } catch (NumberFormatException e) {
            // TODO: print the discount parsing message
            System.out.println("Discount text is not numeric.");
        } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
            // TODO: print the incomplete order message
            System.out.println("Order record is incomplete.");
        }
    }
}
