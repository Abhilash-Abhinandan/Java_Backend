package com.abhilash.error;

public class CustomExceptionPractice1 {
    public static void main(String[] args) {
        RuntimeException noDetails = new GiftCardExpiredException();
        RuntimeException withMessage = new GiftCardExpiredException("Gift card 9001 expired on 2025-01-15");
        RuntimeException wrapped = new GiftCardExpiredException(
                "Could not redeem gift card", new IllegalStateException("provider offline"));
        RuntimeException causeOnly = new GiftCardExpiredException(new IllegalArgumentException("bad date"));

        System.out.println("no message: " + (noDetails.getMessage() == null));
        System.out.println("message: " + withMessage.getMessage());
        System.out.println("wrapped: " + wrapped.getMessage() + " | cause="
                + wrapped.getCause().getClass().getSimpleName() + ":" + wrapped.getCause().getMessage());
        System.out.println("cause only: " + causeOnly.getMessage());
    }

    static class GiftCardExpiredException extends RuntimeException {
        public GiftCardExpiredException() {
        	super();
        }

        public GiftCardExpiredException(String message) {
        	super(message);
        }

        public GiftCardExpiredException(String message, Throwable cause) {
        	super(message, cause);
        }

        public GiftCardExpiredException(Throwable cause) {
        	super(cause);
        }
    }
}