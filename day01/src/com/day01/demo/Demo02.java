package com.day01.demo;

public class Demo02 {
	/**
	 * 
	 * 1字节=8bit
	 * 整型：
	 * 	  byte: 1个字节
	 * 		short: 2个字节
	 * 			int:	4个字节
	 * 				long:	8个字节
	 * @param args
	 */
	public static void main(String[] args) {
		byte num = 127;
		int a = 128;
		num = (byte)a;
		System.out.println(num);
		System.out.println(Integer.toBinaryString(a));
	}

}
