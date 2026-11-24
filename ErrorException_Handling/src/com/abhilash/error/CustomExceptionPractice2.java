package com.abhilash.error;

public class CustomExceptionPractice2 {
    public static void main(String[] args) {
        try {
            processPayment("TX-8842", "CARD_DECLINED", 2599);
        } catch (PaymentDeclinedException e) {
            System.out.println(e.getMessage());
            System.out.println("transaction=" + e.getTransactionId());
            System.out.println("code=" + e.getDeclineCode());
            System.out.println("amountCents=" + e.getAmountCents());
        }
    }

    static void processPayment(String transactionId, String declineCode, int amountCents) {
    	throw new PaymentDeclinedException("CARD_DECLINED", transactionId, declineCode, amountCents);
    }

    static class PaymentDeclinedException extends RuntimeException {
        private String transactionId;
        private String declineCode;
        private int amountCents;

        PaymentDeclinedException(String message, String transactionId, String declineCode, int amountCents) {
            super("Payment " + transactionId + " declined with code " + message);
            this.transactionId = transactionId;
            this.declineCode = declineCode;
            this.amountCents = amountCents;
        }

        String getTransactionId() { return transactionId; }
        String getDeclineCode() { return declineCode; }
        int getAmountCents() { return amountCents; }
    }
}