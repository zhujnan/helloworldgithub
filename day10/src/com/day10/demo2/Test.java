package com.day10.demo2;

public class Test {
	public static void main(String[] args) {
		Godown godown = new Godown(20);
		Consumer c1 = new Consumer(80, godown);
		Consumer c2 = new Consumer(30, godown);
		Consumer c3 = new Consumer(20, godown);
		Producer p1 = new Producer(5, godown);
		Producer p2 = new Producer(5, godown);
		Producer p3 = new Producer(5, godown);
		Producer p4 = new Producer(10, godown);
		Producer p5 = new Producer(20, godown);
		Producer p6 = new Producer(35, godown);
		Producer p7 = new Producer(50, godown);
		c1.start();
		c2.start();
		c3.start();
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
	}
}
