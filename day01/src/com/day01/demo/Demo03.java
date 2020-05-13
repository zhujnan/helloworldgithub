package com.day01.demo;

public class Demo03 {
	public static void main(String[] args) {
		/*int num = 3;
		int a = ++num;//变量自+1
		int b = num++;//赋值之后再+1
		System.out.println(a); //4
		System.out.println(b);  //4
		System.out.println(num);//5
*/	
		/**
		 * 三目运算符:
		 * 			如果表达式的值为true 那么表达式值为1
		 * 			否则表达式为-1
		 */
		//int a = 8>6?1:-1;
		int index = 0;
		boolean flag = false;
		System.out.println((flag!=!flag?index--:index++)==index ? flag: ++index);
	}
}
