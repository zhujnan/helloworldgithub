package com.day02.demo;

import java.util.Scanner;

/**
 * 输入年月日
 * 
 * 
 * @author zhujn
 *
 */
public class Demo1 {
		public static void main(String[] args) {
			System.out.println("请输入年");
			int year,month,day,days =0;
			int e = 0;
			int sum = 0;
			do {
				Scanner sc = new Scanner(System.in);
				year = sc.nextInt();
				System.out.println("请输入月");
				month = sc.nextInt();
				System.out.println("请输入日");
				day = sc.nextInt();
				System.out.println(year);
				if(year<1||month<1||month>12||day<1
						||day>31||month==2&&day>29) {
					e=1;
				}
			}while(e==1);
			for(int i=1;i<month;i++) {
				switch (i) {
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12: days = 31;
					break;
				case 4:
				case 6:
				case 9:
				case 11: days = 30;
					break;
				case 2:
						if(year%400!=0||
						   year%4!=0&&year%100==0) {
							days = 28;
						}else {
							days = 29;
						}
						break;
				default:
					System.out.println("请输入正确的值");
					break;
				}
				sum+=days;
			}
			
			System.out.println("为这一年的第"+(days+day)+"天");
			
		}
}
