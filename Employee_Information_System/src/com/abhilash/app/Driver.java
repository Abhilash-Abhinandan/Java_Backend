package com.abhilash.app;

import com.abhilash.model.Employee;
import com.abhilash.service.SalaryCalculator;

public class Driver {
	public static void main(String args[]) {
		Employee emp = new Employee(88888, "Abhilash", 150000, "Java Backend");
		SalaryCalculator calculator = new SalaryCalculator();
		calculator.printSalarySlip(emp);
	}
}
