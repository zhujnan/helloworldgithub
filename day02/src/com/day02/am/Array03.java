package com.day02.am;

public class Array03 {
	public static void main(String[] args) {
		int[] arry = {3,1,0,6,4};
		//将该数组元素按照从小到大的顺序排列然后输出
		for(int i=0;i<arry.length-1;i++) {
			for(int j=0;j<arry.length-1-i;j++) {
				if(arry[j]>arry[j+1]) {
					int temp = arry[j+1];
					arry[j+1] = arry[j];
					arry[j] = temp;
				}
			}
		}
		for (int i : arry) {
			System.out.println(i);
		}
	}
}
