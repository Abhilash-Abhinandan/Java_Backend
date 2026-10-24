package com.abhilash.oops.polymorphism.empmanagement;

public class FullTimeEmployee extends Employee{
	private final double monthlySalary;
	
	public FullTimeEmployee(String employeeName, double monthlySalary) {
		super(employeeName);
		this.monthlySalary = monthlySalary;
	}
	
	@Override
	public double calculateSalary() {
		return monthlySalary * 1.10;
	}
}
