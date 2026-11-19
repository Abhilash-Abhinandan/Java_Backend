package com.abhilash.error;

public class ThrowPractice4 {
    public static void main(String[] args) {
        Account account = new Account(1000);
        tryWithdraw(account, 300);
        tryWithdraw(account, 800);
        System.out.println("Final balance: " + account.getBalanceCents() + " cents");
    }

    static void tryWithdraw(Account account, int amountCents) {
        try {
            account.withdraw(amountCents);
            System.out.println("Withdrew: " + amountCents + " cents");
        } catch (InsufficientFundsException e) {
            System.out.println("Denied: " + e.getMessage());
        }
    }

    static class Account {
        private int balanceCents;

        Account(int balanceCents) {
            this.balanceCents = balanceCents;
        }

        void withdraw(int amountCents) throws InsufficientFundsException {
        	
        	if (amountCents > balanceCents) {
        		throw new InsufficientFundsException
        		("Cannot withdraw " + amountCents + " cents from balance " + balanceCents + " cents");
        	}
        	
            balanceCents -= amountCents;
        }

        int getBalanceCents() {
            return balanceCents;
        }
    }

    static class InsufficientFundsException extends Exception {
        InsufficientFundsException(String message) {
            super(message);
        }
    }
}