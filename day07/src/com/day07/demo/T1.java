package com.day07.demo;

import java.util.Scanner;

public class T1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		try {
			int r = 56/value;
			System.out.println(r);
		} catch (ArithmeticException e) {
			//打印堆栈中的异常信息
			System.out.println("分母不能为0");
		}
	}

}
