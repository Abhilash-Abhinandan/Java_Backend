package com.abhilash.service;

import com.abhilash.model.Employee;

public class SalaryCalculator {
	private static double HRA_PERCENT = 0.20;
	private static double DA_PERCENT = 0.15;
	private static double TAX_PERCENT = 0.10;
	
	public double calculateGrossSalary(Employee employee) {
		double basic = employee.getEmployeeBasicSalary();
		return basic + (basic * HRA_PERCENT) + (basic * DA_PERCENT);
	}
	
	public double calculateNetSalary(Employee employee) {
		double gross = this.calculateGrossSalary(employee);
		return gross - (gross * TAX_PERCENT);
	}
	
	public void printSalarySlip(Employee employee) {
        double basic = employee.getEmployeeBasicSalary();
        double hra   = basic * HRA_PERCENT;
        double da    = basic * DA_PERCENT;
        double gross = calculateGrossSalary(employee);
        double tax   = gross * TAX_PERCENT;
        double net   = calculateNetSalary(employee);

        System.out.println("========= SALARY SLIP =========");
        System.out.println("Employee ID   : " + employee.getEmployeeId());
        System.out.println("Employee Name : " + employee.getEmployeeName());
        System.out.println("Department    : " + employee.getEmployeeDepartment());
        System.out.printf ("Basic Salary  : %.2f%n", basic);
        System.out.printf ("HRA (20%%)     : %.2f%n", hra);
        System.out.printf ("DA  (15%%)     : %.2f%n", da);
        System.out.printf ("Gross Salary  : %.2f%n", gross);
        System.out.printf ("Tax   (10%%)   : %.2f%n", tax);
        System.out.printf ("Net Salary    : %.2f%n", net);
        System.out.println("===============================");
    }
}
