package com.abhilash.app;

import com.abhilash.serivce.EmployeeSalaryAnalyzer;

public class Driver {
	public static void main(String args[]) {
		double[] salaries = {
			    25000,
			    45000,
			    32000,
			    75000,
			    28000
			};
		
		EmployeeSalaryAnalyzer emp = new EmployeeSalaryAnalyzer(salaries);
		double lowSalary = emp.findLowestSalary();
		System.out.println(lowSalary);
	}
}
