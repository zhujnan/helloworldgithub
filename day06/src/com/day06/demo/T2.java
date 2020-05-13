package com.day06.demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class T2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("date对象字符串表示"
					+date.toString());
		SimpleDateFormat formater2 = new SimpleDateFormat(
				"yyyy年MM月dd日 EEE HH:mm:ss");
		//按指定的格式输出
		try {
			Date date2 = formater2
					.parse("2008年08月08日 星期一 08:08:08");
			 //将指定的日期解析后格式化按指定的格式输出
			System.out.println(date2.toString());
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
