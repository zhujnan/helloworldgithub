package com.day10.demo2;

public class Producer extends Thread{
	private int neednum;//需要生产的数量
	private Godown godown; //仓库
	public Producer(int neednum,
			Godown godown) {
		this.neednum = neednum;
		this.godown = godown;
	}
	public void run() {
		godown.produce(neednum);//指定生产数量的产品
	}
}
