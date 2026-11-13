package com.abhilash.error;

import java.io.IOException;

public class Practice2 {
    public static void main(String[] args) {
        Throwable[] samples = {
                new OutOfMemoryError("heap"),
                new IOException("catalog.csv"),
                new NullPointerException("customer")
        };

        for (Throwable sample : samples) {
            System.out.println(sample.getClass().getSimpleName() + " -> " + classify(sample));
        }
    }

    static String classify(Throwable t) {
        // TODO: Classify Error, RuntimeException, and other Exception objects.
    	if(t instanceof Error) return "Error branch";
    	if(t instanceof RuntimeException) return "Unchecked RuntimeException branch";
    	if(t instanceof Exception) return "Checked Exception branch";
    	
        return "unclassified";
    }
}