package com.day10.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 *  线程池的工作原理:
 * 	创建一个阻塞队列容纳任务，
 *  第一次执行任务，创建多个线程，并处理任务之后每个工作线程自动
 *  从队列中获取任务，直到队列数量为0.
 *  如果线程处于等待状态，一旦有任务进入立马唤醒实现线程的复用。
 *  
 *常用线程池：
 *	1.newFixedThreadPool，该线程池固定大小，
 *初始化的时候指定可以容纳的
 *线程数量。超过这个数目加进去的线程不会再运行，
 *线程的运行顺序不受加入顺序的影响。
 *	2.newCachedThreadPool,它可以存放的线程个数可伸缩。
 *如果线程池长度超过处理需要，可以灵活回收
 *空闲线程。无法回收旧新建线程，以前构造的线程可以使用时就重用他们。
 *
 *	3.newScheduledThreadpool,定时性的周期执行任务。
 *
 *	4.newSingleThreadpool 单任务线程池(单线程化的线程池)
 *					只会用唯一的工作线程来执行任务，保证
 *					所有任务按照指定顺序执行。
 * @author zhujn
 *
 */
public class ThreadPool {

	public static void main(String[] args) {
		ExecutorService	 pool = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 4; i++) {
			pool.execute(new thd());
		}
	}
}
class thd extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"isrunning");
	}
}
