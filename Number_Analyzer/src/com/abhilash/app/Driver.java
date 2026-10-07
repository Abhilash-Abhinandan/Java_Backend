package com.abhilash.app;

import com.abhilash.service.NumberAnalyzer;

public class Driver {
	public static void main(String args[]) {
		NumberAnalyzer numA = new NumberAnalyzer(5);
		boolean result = numA.isPrime();
		
		System.out.println(result);
	}
}
