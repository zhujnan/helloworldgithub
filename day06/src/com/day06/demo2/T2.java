package com.day06.demo2;

import java.util.Random;

public class T2 {
	/**
	 * + - * 除
	 * @param args
	 */
	public static void main(String[] args) {
			int a = 4;
			int result = a*a*a*a;
			double result2 = Math.pow((double)a, 4.0);
			System.out.println(result2);
			Random random = new Random();
			System.out.println("产生一个随机数"+random.nextInt(8));
	}
;
}
