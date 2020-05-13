package com.day05.demo2;

public class MyDate {
	private int month;
	private int day;
	private int year;
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String toDateString() {
		return this.year+"年"
				+this.month+"月"
				+this.day+"日";
		
	}
}
