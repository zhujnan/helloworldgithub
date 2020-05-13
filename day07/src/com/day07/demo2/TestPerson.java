package com.day07.demo2;

public class TestPerson {
	public static void main(String[] args) {
		Person p
			=new Person();
		try {
			p.setAge(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
