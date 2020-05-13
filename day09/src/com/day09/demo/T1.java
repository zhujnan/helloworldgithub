package com.day09.demo;

import java.util.HashMap;

public class T1 {

	public static void main(String[] args) {
		/**
		 * 不加泛型时
		 */
		HashMap hashmap 
			= new HashMap();
		hashmap.put(1, "a");
		String value = (String) hashmap.get(1);
		/**
		 * 加了泛型时
		 */
		HashMap<Integer,String> hashmap2 
			= new HashMap<Integer,String>();
		hashmap2.put(2, "b");
		String value2 = hashmap2.get(2);
	}

}
