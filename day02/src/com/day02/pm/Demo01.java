package com.day02.pm;

import java.util.Arrays;

public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 2行2列
		 */
		int arry[][] = new int[2][2]; //创建一个2维数组对象
		arry[0] = new int[]{1,2};
		arry[1] = new int[]{2,1};
		
		int arry2[][] = {{1,2},{1,2}};//静态初始化
		//声明的同时初始化数组元素
		
		//arry = {new int[] {1,1},new int[] {2,2}};
		
		for(int i=0;i<arry.length;i++) {
			arry[0][i]=1;
		}
		for(int i=0;i<arry.length;i++) {
			for(int j=0;j<arry[i].length;j++) {
				System.out.println(arry[i][j]);
			}
		}
		System.out.println(Arrays.toString(arry));
	}
}
