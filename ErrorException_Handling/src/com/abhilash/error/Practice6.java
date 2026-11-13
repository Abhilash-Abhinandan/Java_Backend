package com.abhilash.error;

public class Practice6 {
    public static void main(String[] args) {
        int totalBoxes = 84;
        String workerCountText = "0";
        String summary = "No summary yet.";

        // TODO: Use a try-catch to assign summary from the risky division.
        // TODO: Catch ArithmeticException and assign the failure message to summary.
        
        try {
        	int parsedCount = Integer.parseInt(workerCountText);
        	int result = totalBoxes / parsedCount;
        	
        	summary = "Each worker gets " + result + " boxes.";
        	
        } catch(ArithmeticException e) {
        	summary = "Cannot divide 84 boxes among 0 workers.";
        }

        System.out.println(summary);
        System.out.println("Scheduler finished.");
    }
    
}