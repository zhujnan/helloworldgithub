package com.day02.am;

public class ArraysUtil {
	//正序输出
		  public void ishow(int[] a) {
			// TODO Auto-generated method stub
			for(int i=a.length-1;i>0;i--) {
				System.out.println(a[i]);
			}
		}
		//反序输出
		  public void show(int[] a) {
			for(int i=a.length-1;i>0;i--) {
				System.out.println(a[i]);
			}
		}
}
