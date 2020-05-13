package com.day05.demo2;

public class PayrollSystem {
	private Employee[] employee;
	
	public PayrollSystem(Employee[] employee) {
		super();
		this.employee = employee;
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}
	
}
