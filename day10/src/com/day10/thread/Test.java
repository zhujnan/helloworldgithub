package com.day10.thread;

/**
 * 求1到100的和，将其分成10个线程，各自求出10个个数的和
 * 然后累加得出最后的结果。
 * @author zhujn
 *
 */
public class Test extends Thread{
		static int n = 0;
		private int startNum=0;
		public Test(int sn) {
			startNum = sn;
		}
		/**
		 * 1号线程走完 ，n的值=前10项和
		 * 2号线程走完，10+区间的和(11———20)
		 * 
		 * 
		 * @param num
		 */
		public static synchronized void addSum(int num) {
			n = n + num;
		}
		public void run() {
			int sum = 0;
			for(int i=0;i<10;++i) {
				sum= sum + startNum+i;
			}
			addSum(sum);
		}
		public static void main(String[] args) {
			Thread[] thList = new Thread[10];
			for(int i=0;i<10;i++) {
				thList[i] = new Test(i*10+1);
				thList[i].start();
			}
			for(int i=0;i<10;i++) {
				try {
					thList[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("sum is"+n);
		}
}
