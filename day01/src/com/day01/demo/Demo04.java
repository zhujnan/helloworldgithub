package com.day01.demo;

public class Demo04 {
	public static void main(String[] args) {
		int a = 2;
		if(3>4&a++>1) {
			System.out.println("你好");
		}
		System.out.println(a);
		if(3>4^3>2) {//亦或表达式为真的条件是，表达式两边有一个为真，一个为假
			System.out.println("true");
		}
	}
}
