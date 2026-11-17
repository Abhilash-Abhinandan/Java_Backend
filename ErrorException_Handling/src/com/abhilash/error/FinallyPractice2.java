package com.abhilash.error;

public class FinallyPractice2 {
    private static boolean overrideFromFinally = true;

    public static void main(String[] args) {
        String result = verdict();
        System.out.println("final verdict: " + result);
    }

    static String verdict() {
        try {
            System.out.println("try evaluating shipment 77");
            //overrideFromFinally = false;
            // we can make it false to stop the overriding if needed!
            
            return "TRY_APPROVED";
            // TODO: return "TRY_APPROVED" from the try block
        } finally {
            System.out.println("finally overriding shipment 77");
            if (overrideFromFinally) {
                // TODO: return "FINALLY_OVERRIDE" from the finally block
            	return "FINALLY_OVERRIDE";
            }
        }

        //return "STARTER_VALUE";
    }
}