package com.abhilash.app;

import com.abhilash.service.ProductPriceAnalyzer;

public class Driver {
	public static void main(String args[]) {
		double[] prices = {
			    499.50,
			    1200.00,
			    1.00,
			    2500.00,
			    999.00
			};
		ProductPriceAnalyzer prd = new ProductPriceAnalyzer(prices);
		double result = prd.findCheapestProduct();
		System.out.println(result);
	}
}
