package com.day12.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestCountDir {
	private int count;
	/**
	 * 统计一个目录下所有的java文件的行数
	 * @param sourceDir
	 */
	private void countDir(String sourceDir) {
		File fSourceDir 
			= new File(sourceDir);
		if(!fSourceDir.exists()
				||!fSourceDir.isDirectory()) {
			System.out.println("源目录不存在");
			return;
		}
		//遍历目录下的文件或目录 
		File[] file = fSourceDir.listFiles();
		for (File file2 : file) {
			if(file2.isFile()) {
				if(file2.getName() //返回一个字符串
						.toLowerCase() //返回一个小写的字符串
							.endsWith(".java")) {//判断
					try {
						countLine(file2);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
			if(file2.isDirectory()) {
				String subSourceDir = sourceDir+
						File.separator+file2.getName();
				countDir(subSourceDir);
			}
		}
	}
	/**
	 * 统计一个java文件的行数
	 * @param file2
	 * @throws IOException 
	 */
	private void countLine(File sourceFile)
				throws IOException {
		BufferedReader br = null;
			try {
				br = new BufferedReader(
						new FileReader(sourceFile));
				while(br.readLine()!=null) {
					count++;
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}finally {
				br.close();
			}
			
	}
	public static void main(String[] args) {
		TestCountDir testCountDir
			= new TestCountDir();
		testCountDir.countDir("E:\\Java\\xingzhi");
		System.out.println(testCountDir.count);
		
	}
}
