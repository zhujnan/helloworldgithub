package com.day01.demo2;

import java.util.Scanner;

/**
 * while
 * continue
 * break
 * @author zhujn
 *
 */
public class Demo05 {
	public static void main(String[] args) {
		/*while(8<31) {
			System.out.println("dd");
		}*/
		
		System.out.println("输入一个整型的值");
		Scanner sc =new Scanner(System.in);
		int a = 0;
		/**
		 * 条件不确定的时候使用
		 */
		do {
			a = sc.nextInt();
			System.out.println("a的值为"+a);
		}while(a>0);
		
	}
}
