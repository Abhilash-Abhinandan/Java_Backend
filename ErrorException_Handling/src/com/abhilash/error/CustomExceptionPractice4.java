package com.abhilash.error;

public class CustomExceptionPractice4 {
    public static void main(String[] args) {
        try {
            validateAddress("US", "12A");
            System.out.println("Address accepted");
        } catch (InvalidShippingAddressException e) {
            System.out.println("Shipping address rejected");
            System.out.println(e.getMessage());
            System.out.println("country=" + e.getCountry());
            System.out.println("postalCode=" + e.getPostalCode());
        }
    }

    static void validateAddress(String country, String postalCode) throws InvalidShippingAddressException {
    	if(country.equals("US") && postalCode.length() != 5) {
    		throw new InvalidShippingAddressException("Invalid postal code 12A for US", country, postalCode);
    	}
    }

    static class InvalidShippingAddressException extends Exception {
        private String country = "";
        private String postalCode = "";

        InvalidShippingAddressException(String message, String country, String postalCode) {
        	super(message);
        	this.country = country;
        	this.postalCode = postalCode;
        }

        String getCountry() { return country; }
        String getPostalCode() { return postalCode; }
    }
}