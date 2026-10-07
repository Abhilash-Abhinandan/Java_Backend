package com.abhilash.service;

public class GradeCalculator {
	double java, sql, html, css, javascript;
	
	public GradeCalculator(double _java, double _sql, double _html, double _css, double _javascript) {
		this.java = _java;
		this.sql = _sql;
		this.html = _html;
		this.css = _css;
		this.javascript =_javascript;
	}
	
	// Method to call the calculatePercentage() and calculate the grade according to marks.
	public String calculateGrade() {
		double totalPercentage = calculatePercentage();
		String grade = null;
		
		if(totalPercentage >= 90) {
			grade = "A";
		} else if(totalPercentage >= 75 && totalPercentage <= 89) {
			grade = "B";
		} else if (totalPercentage >= 60 && totalPercentage <= 74) {
			grade = "C";
		} else if (totalPercentage >= 40 && totalPercentage <= 59) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		return grade;
	}
	
	// Method to check if the input marks are between 0 and 100.He 
	public boolean isValid(double mark) {
		return mark >= 0 && mark <= 100;
	}
	
	// Method to call the isValid() to check the marks mark validation individually.
	private boolean isValidMark() {
		return
			isValid(java)
			&& isValid(sql)
			&& isValid(html)
			&& isValid(css)
			&& isValid(javascript);
	}
	
	// Method to call the isValidMark() and calculate total marks
	public double calculateTotal() {
		if(!isValidMark()) return -1;
		
		double total = (java + sql + html + css + javascript);
		
		if(total == 0) return 0.0;
		
		return total;
	}
	
	// Method to call the caculateTotal() and calculate total percentage
	public double calculatePercentage() {
		double total = calculateTotal();
		
		return (total / 500) * 100;
	}	
}
