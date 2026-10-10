package com.abhilash.model;

public class Employee {
	private long employeeId;
	private String employeeName;
	private double employeeBasicSalary;
	private String employeeDepartment;
	
	public Employee(long _employeeId, String _employeeName, double _employeeBasicSalary, String _employeeDepartment) {
		this.employeeId = _employeeId;
		this.employeeName = _employeeName;
		this.employeeBasicSalary = _employeeBasicSalary;
		this.employeeDepartment = _employeeDepartment;
		
	}
	
	public long getEmployeeId() {
		return this.employeeId;
	}
	
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public double getEmployeeBasicSalary() {
		return this.employeeBasicSalary;
	}
	
	public String getEmployeeDepartment() {
		return this.employeeDepartment;
	}
}
