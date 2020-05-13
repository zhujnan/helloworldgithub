package com.day10.demo;
/**
 * @author admin
 *
 */
public class DrawThread extends Thread{
	private Card card;
	private double DrawAmount;//取款金额
	public DrawThread(String name,
			Card card,
			double drawAmount) {
		super(name);//
		this.card = card;
		DrawAmount = drawAmount;
	}
	public void run() {
				synchronized (card) {
					if (card.getBalance() > DrawAmount) {
						System.out.println(Thread.currentThread().getName() + "取款" + DrawAmount + "成功");
						try {
							Thread.sleep(10);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						card.setBalance(card.getBalance() - DrawAmount);
						System.out.println("账户余额为" + card.getBalance());
					} else {
						System.out.println(Thread.currentThread().getName() + "取款失败");
					}
				}
			
	}
}
