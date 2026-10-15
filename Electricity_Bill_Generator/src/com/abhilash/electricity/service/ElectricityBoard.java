package com.abhilash.electricity.service;

import com.abhilash.electricity.model.Consumer;

public class ElectricityBoard {
	
	// Constants — slab rates (per unit)
    private static final int    SLAB_1_MAX = 100;
    private static final int    SLAB_2_MAX = 300;
    private static final int    SLAB_3_MAX = 500;
    private static final double SLAB_1_RATE = 3.0;
    private static final double SLAB_2_RATE = 5.0;
    private static final double SLAB_3_RATE = 7.0;
    private static final double SLAB_4_RATE = 10.0;
    
    // Fixed charges
    private static final double FIXED_RESIDENTIAL = 50;
    private static final double FIXED_COMMERCIAL  = 150;
    
    // Tax
    private static final double TAX_RATE = 0.05; 

    private Consumer[] consumer;
    
    public ElectricityBoard(Consumer[] consumer) {
    	 if(consumer == null) {
    		 throw new IllegalArgumentException("Consumer array can not be null");
    	 }
    	 
    	 if(consumer.length == 0) {
    		 throw new IllegalArgumentException("Consumer array can not be empty");
    	 }
    	 
    	 for(int count = 0; count < consumer.length; count++) {
    		 if(consumer[count] == null) {
    			 throw new IllegalArgumentException("Consumer details can not be null");
    		 }
    	 }
    	 
    	 this.consumer = new Consumer[consumer.length];
    	 
    	 for(int count = 0; count < consumer.length; count++) {
    		 this.consumer[count] = consumer[count];
    	 }
    }
    
    public double calculateSlabCharge(Consumer consumer) {
        if (consumer == null) {
            throw new IllegalArgumentException("Consumer cannot be null");
        }
        int units = consumer.getConsumedUnits();
        if (units < 0) {
            throw new IllegalArgumentException("Units cannot be negative");
        }

        double total = 0;
        int remaining = units;

        int slab1 = Math.min(remaining, SLAB_1_MAX);
        total += slab1 * SLAB_1_RATE;
        remaining -= slab1;

        int slab2 = Math.min(remaining, SLAB_2_MAX);
        total += slab2 * SLAB_2_RATE;
        remaining -= slab2;

        int slab3 = Math.min(remaining, SLAB_3_MAX);
        total += slab3 * SLAB_3_RATE;
        remaining -= slab3;

        // Anything left is slab 4
        total += remaining * SLAB_4_RATE;

        return total;
    }
    
   public double calculateFixedCharge(Consumer consumer) {
	   String connectionType = consumer.getConnectionType();
	   double fixedRate = 0;
	   
	   if(connectionType.isBlank() || connectionType.isEmpty()) {
		   throw new IllegalArgumentException("Connection type should not be empty!");
	   }
	   
	   fixedRate = (connectionType.equalsIgnoreCase("Residential")) 
			   ? FIXED_RESIDENTIAL : FIXED_COMMERCIAL;
	   
	   return fixedRate;
   }
   
   public double calculateSubTotal(Consumer consumer) {
	   return calculateFixedCharge(consumer) + calculateSlabCharge(consumer);
   }
   
   // Tax = subtotal × TAX_RATE
   public double calculateTax(double subtotal) {
       return subtotal * TAX_RATE;
   }
   
   // Final = subtotal + tax
   public double calculateFinalAmount(Consumer consumer) {
	   double subTotal = calculateSubTotal(consumer);
	   return subTotal + calculateTax(subTotal);
   }

}