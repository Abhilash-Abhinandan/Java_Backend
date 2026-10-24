package com.abhilash.oops.polymorphism.empmanagement;

abstract public class Employee {
	private static int nextId = 1001;
	private final String employeeName;
	private final String employeeId;
	
	public Employee(String employeeName) {
		this.employeeName  = employeeName;
		
		this.employeeId = "EMP" + nextId;
		nextId++;
	}

	abstract public double calculateSalary();
	
	public void displayDetails() {
		System.out.println(getEmployeeId());
		System.out.println(getEmployeeName());
	}
	
	// Getters
	public String getEmployeeName() {
		return employeeName;
	}
	
	public String getEmployeeId() {
		return employeeId;
	}
}