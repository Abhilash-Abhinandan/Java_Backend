package com.abhilash.service;

public class NumberAnalyzer {
	int inputNumber;
	
	public NumberAnalyzer(int _inputNumber) {
		this.inputNumber = _inputNumber;
	}
	
	public boolean isPositive() {
		return inputNumber > 0;
	}
	
	public boolean isEven() {
		return inputNumber % 2 == 0;
	}
	
	public boolean isPrime() {
		if(inputNumber <= 1) return false;
		
		int factors = 0;
		
		for(int count = 1; count <= inputNumber; count++) {
			if(inputNumber % count == 0) factors += 1;
		}
		
		return factors == 2;
	}
	
	public boolean isDivisibleByFive() {
		return inputNumber % 5 == 0;
	}
}
