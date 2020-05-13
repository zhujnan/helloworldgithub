package com.day02.am;

import java.util.Arrays;

public class Arry02_1 {
	public static void main(String[] args) {
		int[] a = {1,4,5};
		ArraysUtil arraysUtil = new ArraysUtil();
		arraysUtil.show(a);
		arraysUtil.ishow(a);
		int[] b = {6,7,8};
		arraysUtil.show(b);//用来迭代输出的方法
		/**
		 * 输出数组的字符串表示形式
		 */
		System.out.println(Arrays.toString(a));
		
	}
	
	
}
