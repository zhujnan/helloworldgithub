package com.day06.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * java.lang包是默认导入的包
 * @author zhujn
 *返回当前时间与1970年1月1日8时0分0秒之间以毫秒为单位的时间差
 */
public class T1 /*extends Object*/{
	public static void main(String[] args) {
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
			Date date = new Date();
			System.out.println("date对象字符串表示"
						+date.toString());
			Date date2 = new Date(); 
			//产生一个formater格式化的实例
			SimpleDateFormat formater = new SimpleDateFormat();
			System.out.println("formater对象默认格式"
						+formater.format(date2));//打印输出默认的格式
			SimpleDateFormat formater2 = new SimpleDateFormat(
							"yyyy年MM月dd日 EEE HH:mm:ss");
			System.out.println("formater对象指定格式"
						+formater2.format(date2)); 
			SimpleDateFormat formater3 = new SimpleDateFormat(
						"yyyy-MM-dd");
			System.out.println("formater对象指定格式"
					+formater3.format(date2)); 
		}
}
