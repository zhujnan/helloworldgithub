package com.day02.am;

import java.util.Arrays;
import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		/*
		 * 在控制台输入5个数字，求5个数的和。
		 * 
		 * 将5个数字，倒叙输出。
		 */
		Scanner sc = new Scanner(System.in);
		//int sum = 0;
		
		int[] arry = {1,2,3,4,5,9};//创建并初始化数组元素
		
		int[] arry2 = new int[3]; //创建了数组但是没有初始化
		int[] arry3 = null;
		/**
		 * 给该数组赋予初始值
		 */

		for(int i=0;i<5;i++) {
			int num = sc.nextInt();
			arry3[i] = num;
		}
		System.out.println(arry.length); //数组长度
	/*	System.out.println(Arrays.toString(arry));
		for(int i=arry.length-1;i>=0;i--) {
			System.out.println(arry[i]);
		}*/
		//数组的字符串表示形式
	}
}
