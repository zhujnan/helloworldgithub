package com.day01.demo2;

public class Demo04 {
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 1;
		int value = getValue(7);
		System.out.println(value);
	}
/**
 * 递归调用
 * @param n
 * @return
 */
	private static int getValue(int n) {
		if(n==1||n==2) {
			return 1;
		}else {
			return getValue(n-2)+getValue(n-1);
		}
}}
