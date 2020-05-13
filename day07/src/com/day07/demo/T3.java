package com.day07.demo;

public class T3 {
	public static void main(String[] args) {
	/*	T3 t3= new T3();
		t3.getResult(0)*/
		int result = 0;
		try {
			 result = getResult(9);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);
	}
	/**
	 * 
	 * @param i
	 * @return
	 * @throws:声明异常自己不处理，由调用者处理。
	 */
	private static int getResult(int i) 
				throws Exception{
		return 6/i;
	}
}
