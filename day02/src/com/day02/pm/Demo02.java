package com.day02.pm;

import java.util.Arrays;

/**
 * 数组常用方法
 */
public class Demo02 {
	public static void main(String[] args) {
			int[] arry = {1,2,3,4,5};
			//输出数组的字符串表示形式
			System.out.println(Arrays.toString(arry));
			int[] arry2 = {2,-3,0,4};
			Arrays.sort(arry2);//对数组进行排序
			//按照从小到大的顺序排列
	}
}
