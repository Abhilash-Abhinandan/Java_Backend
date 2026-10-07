package com.abhilash.services;

public class BillCalculator {
	double unitConsume;
	
	public BillCalculator(double  _unitConsume) {
		this.unitConsume = _unitConsume ;
	}
	
	public double displayBill() {
		return this.calculateBill(unitConsume);
	}
	
	private double calculateBill(double electriUnit) {
		int rupeePerUnit;
		
		if(electriUnit < 0) return -1;
		if(electriUnit  == 0) return 0;
		
		if(electriUnit > 0 && electriUnit <= 100) {
			rupeePerUnit = 5;
		} else if(electriUnit > 100 && electriUnit <= 200) {
			rupeePerUnit = 7;
		} else if(electriUnit > 200 && electriUnit <= 500) {
			rupeePerUnit = 10;
		} else {
			rupeePerUnit = 15;
		}
		
		return (double)electriUnit * rupeePerUnit;
	}
	
}
