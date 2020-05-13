package com.day07.demo2;

public class Person {
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) 
			throws AgeException {
		if(age<=0) {
			throw new AgeException("年龄不正确");
		}
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
