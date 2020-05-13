package com.day03.pm;

public class Person {
	
	private String name;
	private Pet pet;//宠物
	public Person(String name, Pet pet) {
		super();
		this.name = name;
		this.pet = pet;
	}

	public void show() {
		pet.voice();
	}
}
