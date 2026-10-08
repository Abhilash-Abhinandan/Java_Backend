package com.abhilash.service;

public class EmployeeSalaryAnalyzer {
	private double[] salaries;
	
	public EmployeeSalaryAnalyzer(double[] _salaries) {
		this.salaries = new double[_salaries.length];
		
		for(int count = 0; count < this.salaries.length; count++) {
			this.salaries[count] = _salaries[count];
		}
	}	
	
	public double findHighestSalary() {
		double highestSalary = this.salaries[0];
		
		for(int count = 0; count < this.salaries.length; count++) {
			if(highestSalary < this.salaries[count]) highestSalary = this.salaries[count];
		}
		
		return highestSalary;
	}
	
	public double findLowestSalary() {
		double lowestSalary = this.salaries[0];
		
		for(int count = 0; count < this.salaries.length; count++) {
			if(lowestSalary > this.salaries[count]) lowestSalary = this.salaries[count];
		}
		
		return lowestSalary;
	}
	
	public double findAverageSalary() {
		double totalSalary = 0;
		
		for(int count = 0; count < this.salaries.length; count++) {
			totalSalary += this.salaries[count];
		}
		
		return totalSalary / this.salaries.length;
	}
	
	public int countSalaryAbove40000() {
		int salaryAbove40000 = 0;
		
		for(int count = 0; count < this.salaries.length; count++) {
			if(this.salaries[count] > 40000) salaryAbove40000 += 1;
		}

		return salaryAbove40000;
	}
	
	public int countSalaryBellow30000() {
		int salaryBelow30000 = 0;
		
		for(int count = 0; count < this.salaries.length; count++) {
			if(this.salaries[count] < 30000) salaryBelow30000 += 1;
		}
		
		return salaryBelow30000;
	}
}
