package com.abhilash.error;

public class TryWithResourcesPractice0 {
    static class ReceiptFile implements AutoCloseable {
        private final String name;

        ReceiptFile(String name) {
            this.name = name;
            System.out.println(name + " opened");
        }

        void write(String line) {
            System.out.println(name + " wrote: " + line);
        }

        @Override
        public void close() {
            System.out.println(name + " closed");
        }
    }

    public static void main(String[] args) {
    	try(ReceiptFile file = new ReceiptFile("receipt-1001")) {
    		file.write("SKU-7 x2");
    		file.write("total 19.98");
    	}
    }
}