package com.abhilash.error;

public class PracticeThrows0 {
    public static void main(String[] args) {
        try {
            openFile("orders.csv");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void openFile(String fileName) throws MissingFileException {
    	if(fileName.equals("orders.csv")) {
    		throw new MissingFileException(fileName);
    	}
    	
        System.out.println("Opened " + fileName);
    }

    static class MissingFileException extends Exception {
        MissingFileException(String fileName) {
            super("Missing file: " + fileName);
        }
    }
}