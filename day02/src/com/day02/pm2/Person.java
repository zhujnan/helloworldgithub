package com.day02.pm2;

public class Person {
	/**
	 * 在一个类中不添加构造方法的时候，默认
	 * 会添加一个无参数的构造函数（方法)，如果
	 * 自行添加了有参构造函数，不提供无参构造函数
	 * 方法名和类名一样
	 * 无返回值类型
	 * 无参数
	 */
	String name;//姓名
	private int age;//年龄
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age<=0) {
			age = 1;
		}
		this.age = age;
	}

	Person(String name){
		this.name=name;
	}
	
	public void eat() {
		System.out.println("吃饭");
	}
	public void eat(String food) {
		
	}
	public static void main(String[] args) {
		Person p = new Person("马云");//构造函数
		p.setAge(-3);
	}
}
