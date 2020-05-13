package com.day10.demo1;

public class Card {
	private String number;
	private double balance;
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
	public synchronized void getMoney(double DrawAmount){
					if (getBalance() > DrawAmount) {
						System.out.println(Thread.currentThread().getName()
								+ "取款" + DrawAmount + "成功");
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						setBalance(getBalance() - DrawAmount);
						System.out.println("账余额为" + getBalance());
					} else {
						System.out.println(Thread.currentThread().getName()
								+ "取款失败");
					}
				
	}
}
