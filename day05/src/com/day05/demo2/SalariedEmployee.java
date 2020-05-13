package com.day05.demo2;

public class SalariedEmployee 
extends Employee{
	
	private double monthlySalary;
	
	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double earnings() {
		return this.monthlySalary;
	}

}
