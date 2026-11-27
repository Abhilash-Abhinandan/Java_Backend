package com.abhilash.error;

public class ExceptionChanning {
	 public static void main(String[] args) {
		 	RootCauseDemo root = new RootCauseDemo();

	        RuntimeException e = new RuntimeException("Something failed");

	        e.initCause(e);

	        System.out.println(root.rootCause(e).getMessage());
	    }
	
}

class RootCauseDemo {

    public static Throwable rootCause(Throwable t) {
        Throwable current = t;

        while (current.getCause() != null
                && current.getCause() != current) {
            current = current.getCause();
        }

        return current;
    }

}