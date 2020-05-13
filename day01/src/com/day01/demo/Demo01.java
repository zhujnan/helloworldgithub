package com.day01.demo;

public class Demo01 {

	public static void main(String[] args) {
		int a = 1; // 变量前面必须要有数据类型
		a = 3;
		double pi = 3.14;//浮点类型,小数默认为double类型
		System.out.println("今天是第"+a+"天");
		System.out.println(pi);
		System.out.println("===============");
		char ch = 'z';//单引号引起来的为字符
		System.out.println(ch);
		char ch2 = 444;//char类型如果被赋予整型数值
						//取值范围0-65535
		System.out.println(ch2);//1001所对应的字符
		
		boolean b = true; //只能有2种值 true/false
		/**
		 * =右边还可以是布尔类型表达式
		 * boolean c = 8>4; true
		 */
	}

}
