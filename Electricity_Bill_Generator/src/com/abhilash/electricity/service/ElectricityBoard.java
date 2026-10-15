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
    private static final double TAX_RATE = 0.5; 

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
	   double total = 0;
	   double consumedUnits = consumer.getConsumedUnits();
	   
	   if(!Double.isFinite(consumedUnits) || consumedUnits < 0) {
		   throw new IllegalArgumentException("Units should be a positive number!");
	   }
	   
	   double remeaing = 0;
	   if(consumedUnits > SLAB_1_MAX) {
		  remeaing = consumedUnits - SLAB_1_MAX;
		  total += SLAB_1_MAX * SLAB_1_RATE;
	   } else {
		   return total += consumedUnits * SLAB_1_RATE;
	   }
	   
	   if(remeaing > SLAB_2_MAX) {
		   remeaing -= SLAB_2_MAX;
		   total += SLAB_2_MAX * SLAB_2_RATE;
	   } else {
		   return total += remeaing * SLAB_2_RATE;
	   }
	   
	  if(remeaing > SLAB_3_MAX) {
		  remeaing -= SLAB_3_MAX;
		  total += SLAB_3_MAX * SLAB_3_RATE;
	  } else {
		  return total += remeaing * SLAB_3_RATE;
	  }
	  
	  if(remeaing > 0) {
		  total += remeaing * SLAB_4_RATE;
		  remeaing = 0;
		  return total;
	  }
	  
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