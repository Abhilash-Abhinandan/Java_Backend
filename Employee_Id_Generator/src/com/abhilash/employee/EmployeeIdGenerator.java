package com.abhilash.employee;

public class EmployeeIdGenerator {
	private static int nextId = 1001;
	
	private String name, department, employeeId ; 
	private double salary;
	
	public EmployeeIdGenerator(String _name, String _department, double _salary) {
		if(_name == null || _name.isBlank()) {
			throw new IllegalArgumentException("Name is required!");
		}
		
		if(_department == null || _department.isBlank()) {
			throw new IllegalArgumentException("Department is required!");
		}
		
		if(_salary <= 0) {
			throw new IllegalArgumentException("Salary is required!");
		}
	
		// Auto generated ID 
		this.employeeId = "EMP" + nextId;
		nextId++;
		
		this.name = _name;
		this.department = _department;
		this.salary = _salary;
	}
	
	// Getters
	public String getEmployeeId() { return employeeId;}
	public String getName() { return name;}
	public String getDepartment() { return department;}
	public double getSalary() {return salary;}
}
