package com.day09.demo;

public class Person<T,V> {
	private T name;
	private V number;
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public V getNumber() {
		return number;
	}
	public void setNumber(V number) {
		this.number = number;
	}
	public void show() {
		System.out.println("name的值为"+this.name);
		System.out.println("number的值为"+this.number);
	}
}
