package com.day02.pm;

import java.util.Arrays;
import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		int[] arry = new int[10];
		Random random = new Random();
		int max = 0;
		for(int i=0;i<arry.length;i++) {
			arry[i]=random.nextInt(100);
			//在0-100之间随机产生一个随机数
			max=arry[0];
			if(arry[i]>max) {
				max=arry[i];
			}
		}
		System.out.println(Arrays.toString(arry));
		System.out.println(max);
	}
}
