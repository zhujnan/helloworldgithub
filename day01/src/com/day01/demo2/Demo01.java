package com.day01.demo2;

import java.util.Scanner;

/**
 * 分支与循环
 * 
 * 分支语句：
 * 		  if
 * 		  if else
 * 		  if else if  else
 * 
 * 		  switch
 * 
 * 循环语句:
 * 		  for循环
 * 		  while循环
 * 		  do while循环
 * @author zhujn
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		/**
		 * 从控制台获取输入的int值
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if(a>0) {
			System.out.println("正数");
		}else if(a==0) {
			System.out.println("0");
		}else {
			System.out.println("负数");
		}	
	}
}
