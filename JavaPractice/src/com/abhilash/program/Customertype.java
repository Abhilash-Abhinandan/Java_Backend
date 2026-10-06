package com.abhilash.program;

public class Customertype {
	
	public float customerType(String customertType, float amount) {
		if(amount <= 1000) {
			System.out.println("You got nto discount!");
			return amount;
		} 
		
		float discount = 0.0f;
		
		switch (customertType) {
		
			case "GOLD" :
				discount = 20;
				break;
				
			case "SILVER" :
				discount = 10;
				break;
				
			case "REGULAR" :
				discount = 5;
				break;
				
			default:
				System.out.println("Give some valid input!");
				return discount;
		}
		
		return totalAmount(amount, discount);
	
	}	
	
	public float totalAmount(float amount, float discount) {
		float amt = amount * (discount / 100.00f);
		float finalPrice = (amt > 2500) ? (amount - 2500): (amount - amt);
		
		return finalPrice;	
	}
}
