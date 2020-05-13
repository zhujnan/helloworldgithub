package com.day04.entity;

public class Person {
	private int age;
	private String name;
	Person(){
		System.out.println("无参构造方法");
	}
	Person(String name){
		this();//调用本类的无参构造
		System.out.println("构造方法"+name);
	}
	Person(String name,int age){
		this("hello");
	}
	public void show() {
		System.out.println("show方法");
	}
	public void out() {
		this.show();
	}
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
	
	
	
}
