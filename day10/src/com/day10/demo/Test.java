package com.day10.demo;

/**
 * 线程安全问题的产生，及解决方案。
 * @author zhujn
 *
 */
public class Test {
	public static void main(String[] args) {
			Card card = new Card("12345",1000);
			DrawThread t1 = new DrawThread("王先生", card, 800);
			DrawThread t2 = new DrawThread("陈女士", card, 800);
			t1.start();
			t2.start();
	}
}
