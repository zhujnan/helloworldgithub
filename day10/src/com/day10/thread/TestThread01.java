package com.day10.thread;
/**
 * 线程的实现方式1：继承Thread类
 * @author zhujn
 */
public class TestThread01 extends Thread{
	public TestThread01(String string) {
			super(string);
	}
	@Override
	public void run() {
		for(int i=0;i<20;i++) {
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread
					.currentThread().getName()+"你好");
		}
	}
	public static void main(String[] args) {
		System.out.println("主线程");
		TestThread01 t1 = new TestThread01("1号技师");
		TestThread01 t2= new TestThread01("2号技师");
		t1.start();//进入可运行状态
		t2.start();//进入可运行状态
	}
}
