package com.day10.demo1;

public class DrawThread extends Thread{
	private Card card;
	private double DrawAmount;//ȡ����
	public DrawThread(String name,Card card, double drawAmount) {
		super(name);//��nameֵ���ݸ��߳���
		this.card = card;
		DrawAmount = drawAmount;
	}
	public void run() {
		card.getMoney(DrawAmount);
	}
}
