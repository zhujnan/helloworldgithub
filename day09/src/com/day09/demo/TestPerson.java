package com.day09.demo;

public class TestPerson {
	public static void main(String[] args) {
		Person<String,Integer> p
		= new Person<String,Integer>();
		p.setName("zs");
		p.setNumber(32);
		
		Person<Double,String> p2
		= new Person<Double,String>();
		p2.setName(3.14);
		p2.setNumber("圆周率");
	}
}
