package com.day10.runnable;

public class TestInterrupt {
	public static void main(String[] args) {
		//t线程
		Thread t = new Thread(){
			public void run() {
				long start = System.currentTimeMillis();//休眠前系统时间
				try {
					Thread.sleep(10000);//睡眠10秒
				} catch (InterruptedException e) {
					e.printStackTrace();
				};
				long end = System.currentTimeMillis();//醒来的时间
				System.out.println("线程T休眠了"+(end-start));
				System.out.println("##线程t结束");
			}
		};
		t.start();
		//主线程
		try {
			Thread.sleep(3000);//主线程休眠3秒
			t.interrupt();//打断t的休眠
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("主线程结束");
	}
	}
	
