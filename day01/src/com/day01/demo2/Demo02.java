package com.day01.demo2;

import java.util.Scanner;

public class Demo02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch (a) {//短整型:byte short int ,1.7版本之后字符串
					//char也可以
			case 1:
					System.out.println("周一"); break;
			case 2:
					System.out.println("周二"); break;
			case 3:
					System.out.println("周三"); break;
			default:
					System.out.println("请输入正确的值");
				break;
		}
	}
}
