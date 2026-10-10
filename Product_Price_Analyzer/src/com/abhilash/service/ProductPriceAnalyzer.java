package com.abhilash.service;

public class ProductPriceAnalyzer {
	private double[] productPrices;
	
	public ProductPriceAnalyzer(double[] _productPrice) {
		if(_productPrice == null)throw new IllegalArgumentException("Price array can not be null");
		if(_productPrice.length == 0) throw new IllegalArgumentException("Price array can not be empty");
		
		this.productPrices = new double[_productPrice.length];
		
		for(int count = 0; count < this.productPrices.length; count++) {
			if(_productPrice[count] < 0)throw new IllegalArgumentException("Invalid price");
			this.productPrices[count] = _productPrice[count];
		}
	}
	
	public double calculateTotalPrice() {
		
		double totalPrice = 0;
		for(int count = 0; count < this.productPrices.length; count++) {
			totalPrice += this.productPrices[count];
		}
		
		return totalPrice;
	}
	
	public double calculateAveragePrice() {
		
		return this.calculateTotalPrice() / this.productPrices.length;
	}
	
	public double findExpensiveProduct() {
		
		double expensiveProduct = this.productPrices[0];
		for(int count = 1; count < this.productPrices.length; count++) {
			if(expensiveProduct < this.productPrices[count]) expensiveProduct = this.productPrices[count];
		}
		
		return expensiveProduct;
	}
	
	public double findCheapestProduct() {
		
		double cheapestProduct = productPrices[0];
		for(int count = 1; count < this.productPrices.length; count++) {
			if(cheapestProduct > this.productPrices[count]) cheapestProduct = this.productPrices[count];
		}
		
		return cheapestProduct;
	}
	
	public int calculateNumberOfProductsAbove1000() {
		
		int numberOfProducts = 0;
		for(int count = 0; count < this.productPrices.length; count++) {
			if(this.productPrices[count] > 1000) numberOfProducts += 1;
		}
		
		return numberOfProducts;
	}
}
 