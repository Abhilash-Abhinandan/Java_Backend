package com.abhilash.error;

public class PracticeThrows2 {
    public static void main(String[] args) {
        try {
            printDailySummary();
        } catch (Exception e) {
            System.out.println("Report failed: " + e.getMessage());
        }
    }

    static void printDailySummary() throws DataUnavailableException {
    	System.out.println("Building daily summary");
    	int users = loadUserCount("analytics-db");
    	System.out.println("Users: " + users );
    }

    static int loadUserCount(String source) throws DataUnavailableException {
        throw new DataUnavailableException(source);
    }

    static class DataUnavailableException extends Exception {
        DataUnavailableException(String source) {
            super("Source " + source + " unavailable");
        }
    }
}