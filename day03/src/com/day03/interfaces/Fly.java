package com.day03.interfaces;

 public interface Fly {
	 int num = 0;
	void fly();
}
class Bird implements Fly{
	@Override
	public void fly() {
		System.out.println("鸟儿飞了"+num);
	}
}
class Plane implements Fly{
	@Override
	public void fly() {
		System.out.println("飞机飞了");
	}
	
}