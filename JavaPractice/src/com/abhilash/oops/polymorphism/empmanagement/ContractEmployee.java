package com.abhilash.oops.polymorphism.empmanagement;

public class ContractEmployee extends Employee{
	private final double hourlyRate;
	private final int hoursWorked;
	
	public ContractEmployee(double hourlyRate, int hoursWorked, String employeeName) {
		super(employeeName);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public double calculateSalary() {
		return hourlyRate * hoursWorked;
	}
}
