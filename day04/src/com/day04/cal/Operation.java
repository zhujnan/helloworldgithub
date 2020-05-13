package com.day04.cal;
/**
 * 抽象类与接口都是对已有的类向上进行抽取
 * 抽象类偏向定义的抽象
 * 接口偏向行为的抽象
 *   
 * @author zhujn
 * 
 * 该类由加减乘除运算表达式向上抽取而来
 * 所以该类中的result方法为抽象的没有具体实现
 * 由各个表达式来实现
 *
 */
public abstract class Operation {
	private double numA;
	private double numB;
	
	public double getNumA() {
		return numA;
	}
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public double getNumB() {
		return numB;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
	public abstract double getResult();
}
