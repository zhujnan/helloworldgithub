package com.day03.pm;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bird bird = new Bird("啄木鸟");
		Dog dog = new Dog("哮天犬");
		Person p
			= new Person("马云",bird);
		p.show();
	}

}
