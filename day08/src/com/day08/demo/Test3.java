package com.day08.demo;

import java.util.Arrays;

public class Test3 {
	public static void main(String[] args) {
		int arr[] = {1,3,1,2,1,3,2,1};
		int result[] =
				new int[arr.length];
		/**
		 * 暴力解法，时间复杂度为o(n^2)
		 */
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<i;j++) {
				if(arr[j]==arr[i]) {
					result[i] = j;
					break;
				}else {
					result[i]=-1;
				}
			}
			System.out.println();
		}
		System.out.println(Arrays.toString(result));
	}
}
