package com.day05.demo2;

public class TestMain {
	public static void main(String[] args) {
		SalariedEmployee salariedEmployee
			= new SalariedEmployee();
		MyDate mydate = new MyDate();
		mydate.setDay(1);
		mydate.setMonth(2);
		mydate.setYear(2020);
		
		salariedEmployee.setBirthday(mydate);
		HourlyEmployee hourlyEmployee
			= new HourlyEmployee();
		hourlyEmployee.setBirthday(mydate);
		
		Employee[] employee = new Employee[2];
		employee[0] = salariedEmployee;
		employee[1] = hourlyEmployee;
		
		PayrollSystem payrollSystem
			= new PayrollSystem(employee);
		Employee[] employee2
			=payrollSystem.getEmployee();
		for (int i = 0; i < employee2.length; i++) {
			if(employee2[i]
					.getBirthday()
						.getMonth()==2) {
				System.out.println("今天是你的生日"+
						employee2[i].earnings()+"工资增加"+100);
			}else {
				System.out.println("你的工资为"+
						employee2[i].earnings());
			}
		
		
	}
	}}
