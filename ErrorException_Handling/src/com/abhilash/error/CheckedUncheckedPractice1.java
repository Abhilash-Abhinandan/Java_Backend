package com.abhilash.error;

import java.io.IOException;

public class CheckedUncheckedPractice1 {
    public static void main(String[] args) {
        try {
            String config = readConfig("settings.properties");
            System.out.println("Config: " + config);
        } catch (IOException e) {
        	System.out.println("Could not rad checked exception: " + e.getMessage());
        }
    }

    static String readConfig(String fileName) throws IOException {
        throw new IOException(fileName);
    }
}