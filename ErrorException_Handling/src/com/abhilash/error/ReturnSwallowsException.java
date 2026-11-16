package com.abhilash.error;

public class ReturnSwallowsException {
    public static int getOrderTotal(String raw) {
        try {
            return Integer.parseInt(raw);
        } finally {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println("total for '42': " + getOrderTotal("42"));
        System.out.println("total for 'abc': " + getOrderTotal("abc"));
    }
}

/*
 * Both calls return -1. The successful parse of "42" was about to return 42, then finally overrode it with -1. The failing parse of "abc" was about to throw NumberFormatException, then finally overrode it with -1. The exception is swallowed. No stack trace, no log line, no signal to the caller that anything went wrong. The method just returns -1 either way.
 */
