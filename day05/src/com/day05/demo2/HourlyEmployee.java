package com.day05.demo2;

public class HourlyEmployee
extends Employee{
	private double wage;
	private int hour;
	
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	@Override
	public double earnings() {
		// TODO Auto-generated method stub
		return wage*hour;
	}
	@Override
	public String toString() {
		return "HourlyEmployee [wage=" + wage + ", hour=" + hour + "]";
	}
	
}
