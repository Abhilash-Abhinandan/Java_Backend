package com.abhilash.error;

import java.io.IOException;

public class CheckedUncheckedPractice4 {
    public static void main(String[] args) {
        printBadge("missing.csv", "50");
        printBadge("customers.csv", "twenty");
        printBadge("customers.csv", "75");
    }

    static void printBadge(String fileName, String rawPoints) {
        try {
            System.out.println(loadBadge(fileName, rawPoints));
        } catch (IOException e) {
            System.out.println("Checked failure: " + e.getMessage());
        }
    }

    static String loadBadge(String fileName, String rawPoints) throws IOException {
        if (fileName.equals("missing.csv")) {
        	throw new IOException("missing file: " + fileName);
        }
        
        try {
            int points = parsePoints(rawPoints);
            return "Badge points: " + points;
        } catch (IllegalArgumentException e) {
        	return "Badge problem: " + e.getMessage();
        }
    }

    static int parsePoints(String rawPoints) {
        if (rawPoints.equals("twenty")) {
        	throw new IllegalArgumentException("not a number: " + rawPoints);
        }
        
        return Integer.parseInt(rawPoints);
    }
}