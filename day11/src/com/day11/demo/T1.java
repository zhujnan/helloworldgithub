package com.day11.demo;

import java.io.File;
import java.io.IOException;

public class T1 {
	public static void main(String[] args) {
	/*	File file = new File("D:\\a.txt");
		try {
			file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		File dir1 = new File("D:/IOTest/dir1");
		if (!dir1.exists()) {     // 如果D:/IOTest/dir1不存在，就创建为目录
			dir1.mkdirs(); }
	}
}
