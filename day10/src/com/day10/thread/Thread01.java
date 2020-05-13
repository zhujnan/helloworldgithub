package com.day10.thread;

public class Thread01 extends Thread{
	public Thread01(String name) {
		super(name);
	}
	@Override
	public void run() {
		for(int i=1;i<100;i+=2) {
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(
					Thread.currentThread().getName()+i);
		}
	}
}
class Thread02 extends Thread{
	public Thread02(String name) {
		super(name);
	}
	public void run() {
		for(int i=0;i<100;i+=2) {
			try {
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+i);
		}
	}
}