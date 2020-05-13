package com.day03.pm;

/**
 * 宠物类
 * @author zhujn
 *
 */
public abstract class Pet {
	private String name;
	public Pet(String name) {
		super();
		this.name = name;
	}
	public abstract void voice();
}
class Bird extends Pet{
	public Bird(String name) {
		super(name);
	}
	@Override
	public void voice() {
		System.out.println("叽叽喳喳");
	}
}
class Dog extends Pet{
	public Dog(String name) {
		super(name);
	}
	@Override
	public void voice() {
		System.out.println("旺旺");
	}
	
}








