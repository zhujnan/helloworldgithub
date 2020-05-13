package com.day06.demo;

import java.util.Calendar;
import java.util.Date;

public class T3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		 // 从一个 Calendar 对象中获取 Date 对象
		Date date = calendar.getTime();
		//使用给定的 Date 设置此 Calendar 的时间
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_MONTH, 8);
		System.out.println("当前时间日设置为8后,时间是:" +       
		                                             calendar.getTime());
		calendar.add(Calendar.HOUR, 2);
		System.out.println("当前时间加2小时后,时间是:" +    
		                                            calendar.getTime());
		calendar.add(Calendar.MONTH, -2);
		System.out.println("当前日期减2个月后,时间是:" + 
		                                            calendar.getTime());
		
		calendar.add(Calendar.DAY_OF_MONTH, -6);
		System.out.println("当前日期6天前,时间是:" + 
		                                            calendar.getTime());
		

	}

}
