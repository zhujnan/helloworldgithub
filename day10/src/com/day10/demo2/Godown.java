package com.day10.demo2;
/**
 * 存放汉堡的仓库类
 * @author admin
 *
 */
public class Godown {
	public static final int max_size=100;//最大库存
	public int curnum;//当前库存
	public Godown(int curnum) {
		this.curnum = curnum;
	}; 
	Godown(){
	}
	/**
	 * 指定生产数量的产品
	 */
	public synchronized void produce(int neednum){
		while(neednum + curnum>max_size){
			System.out.println("需要生产的产品数量"+neednum+
					"超过剩余库存量"+(max_size-curnum)+
					"暂时不能执行生产任务");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		/**
		 * 满足生产条件，进行生产。
		 */
		curnum += neednum;
		System.out.println("已经生产了"+neednum+"个产品，现仓储量为"+curnum);
		notifyAll();
	}
	/**
	 * 消费指定数量的产品
	 */
	public synchronized void consume(int neednum){
		while(curnum<neednum){
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		/**
		 * 满足消费条件，进行消费。
		 */
		curnum -= neednum;
		System.out.println("已经消费了"+neednum
				+"个产品,现仓储量为"+curnum);
		notifyAll();
	}
}
