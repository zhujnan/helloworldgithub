package com.day10.thread;

public class TestThread {
	public static void main(String[] args) {
		Thread01 t1 = new Thread01("奇数");//5
		Thread02 t2 = new Thread02("偶数");
		t1.setPriority(10);//优先级最高
		t2.setPriority(1);//优先级最低
		t1.start();
		t2.start();
	}
}
