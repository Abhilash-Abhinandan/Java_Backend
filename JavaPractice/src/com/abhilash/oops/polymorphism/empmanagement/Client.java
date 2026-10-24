package com.abhilash.oops.polymorphism.empmanagement;

public class Client {
	public static void main(String args[]) {
		PayrollProcessor payrollProcessor = new PayrollProcessor();
		
		Employee emp1 = new FullTimeEmployee("Abhilash", 150000);
		double salary = payrollProcessor.processSalary(emp1); 
		System.out.println(salary);
		
		Employee emp2 = new ContractEmployee(10000, 6, "Abhinandan");
		double salary1 = payrollProcessor.processSalary(emp2);
		System.out.println(salary1);
		emp2.displayDetails();
	}
}
