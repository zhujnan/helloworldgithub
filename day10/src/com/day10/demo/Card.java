package com.day10.demo;

//银行卡
public class Card {
	private String number;//卡号
	private double balance;//余额
	public Card(String number, double balance) {
		super();
		this.number = number;
		this.balance = balance;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
