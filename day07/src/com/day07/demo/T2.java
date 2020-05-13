package com.day07.demo;

public class T2 {
	public static void main(String[] args) {
		int[] arry = {3,4,0};
		for(int i=0;i<=arry.length;i++) {
			int j =0;
			try {
				j = 6/arry[i];
			} catch (ArithmeticException e) {
				System.out.println("分母不能为0");
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("数组下标不能越界");
			}finally {
				System.out.println("程序执行结束，不管有没有异常都执行");
			}
			System.out.println(j);
		}
	}
}
