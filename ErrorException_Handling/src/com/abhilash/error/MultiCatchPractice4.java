package com.abhilash.error;

public class MultiCatchPractice4 {
    static class PaymentException extends RuntimeException {}
    static class CardDeclinedException extends PaymentException {}
    static class LimitExceededException extends PaymentException {}

    public static void main(String[] args) {
        String[] events = {"declined", "limit", "gateway", "bad-number", "ok"};

        for (String event : events) {
            try {
                charge(event);
                System.out.println(event + ": charge approved");
            } catch (CardDeclinedException e) {
                // TODO: print the card-declined message
                System.out.println("declined: card declined");
            } catch (LimitExceededException e) {
                // TODO: print the limit-exceeded message
                System.out.println("limit: limit exceeded");
            } catch (PaymentException e) {
                // TODO: print the general payment failure message
                System.out.println("gateway: general payment failure");
            } catch (NumberFormatException e) {
                // TODO: print the amount format message
                System.out.println("bad-number: amount format error");
            }
            System.out.println(event + ": audit logged");
        }
    }

    static void charge(String event) {
        switch (event) {
            case "declined" : throw new CardDeclinedException();
            case "limit" : throw new LimitExceededException();
            case "gateway" : throw new PaymentException();
            case "bad-number" : Integer.parseInt("19x");
            default : { }
        }
    }
}
