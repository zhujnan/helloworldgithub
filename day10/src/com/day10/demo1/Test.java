package com.day10.demo1;

public class Test {
	public static void main(String[] args) {
		Card card = new Card("12345",1000);
		DrawThread t1 = new DrawThread("张先生", card, 800);
		DrawThread t2 = new DrawThread("王女士", card, 800);
		t1.start();
		t2.start();
	}
}
