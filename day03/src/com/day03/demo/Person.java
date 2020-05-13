package com.day03.demo;

public class Person {
	
	
	
	private int age;
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	private String name;
	
	
	public void out( ) {
		Student student = new Student();
		
		int a=0;
		System.out.println(a+"你好"
	+name+"年龄"+age);
	
	}
	
}
