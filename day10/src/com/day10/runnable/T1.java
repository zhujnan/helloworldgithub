package com.day10.runnable;

/**
 * join():在A线程中调用B线程的join()方法，
 * 		表示：A线程停止执行，直到B线程执行完毕，
 * 		A线程在接着join()之后的代码执行
 * @author zhujn
 */
class T2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("T2的值为"+i+"***");
		}
	}
}
public class T1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<9;i++) {
			System.out.println("T1的值为"+i+"---");
			if(i==5) {
				Thread.yield();
			}
		}
	}
}
