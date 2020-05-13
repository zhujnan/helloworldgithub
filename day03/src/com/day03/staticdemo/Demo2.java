package com.day03.staticdemo;

public class Demo2 {
	{
		System.out.println("普通代码块");
	}
	public Demo2() {
		System.out.println("构造代码块");
	}
	public static int num = 3;
	double num2 = 3.14;
	static {
		System.out.println("num属性的值为"+num2);
		System.out.println("静态代码块");
	}
	public static void main(String[] args) {
		Demo2 demo = new Demo2();
	}
}
