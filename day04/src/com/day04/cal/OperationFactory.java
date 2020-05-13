package com.day04.cal;
/**
 * 工厂类
 * 
 * 
 * 设计模式（孙子兵法）：	
 * 		前人总结出来的解决一类问题的最佳方案。
 * 
 * 
 * 23种设计模式之工厂模式：
 * 
 * 
 * @author zhujn
 *
 */
public class OperationFactory {
	
	public static Operation operation(String str) {
		Operation opera = null;
		switch (str) {
		case "+":
			opera= new AddOperation();
			break;
		case "-":
			opera= new SubOperation();
			break;
		case "*":
			opera= new MulOperation();
			break;
		case "/":
			opera= new DivOperation();
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		return opera;
		
	}
}
