package com.day05.demo;

public class FlyTest {
	public static void main(String[] args) {
		/**
		 * 当实现接口的类的对象只需要被使用一次的
		 * 时候，可以使用匿名内部类的方式来完成调用
		 * 匿名内部类不能定义任何静态成员、方法和类，
		 * 只能创建匿名内部类的一个实例。
		 * 一个匿名内部类一定是在new的后面
		 * ，用其隐含实现一个接口或实现一个类
		 */
		new Fly() {
			@Override
			public void show() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
