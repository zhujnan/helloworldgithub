package com.day06.demo2;

import java.math.BigDecimal;
import java.math.BigInteger;

public class T3 {
	public static void main(String[] args) {
		double result = 3.1456677/32;
		System.out.println(result);
		
		BigDecimal bigDecimal = new BigDecimal(3.1456677);
		System.out.println(bigDecimal.divide(new BigDecimal(32)));
		test1();
	}

	private static void test1() {
		BigInteger bi = new BigInteger("12433241123");
		BigDecimal bd = new BigDecimal("12435.351");
		BigDecimal bd2 = new BigDecimal("11");
		System.out.println(bi);
		//System.out.println(bd.divide(bd2));
		System.out.println(bd.divide(bd2,BigDecimal.ROUND_HALF_UP));
		System.out.println(bd.divide(bd2,15,BigDecimal.ROUND_HALF_UP));

	}
}
