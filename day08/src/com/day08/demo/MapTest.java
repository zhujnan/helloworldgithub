package com.day08.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {
	public static void main(String[] args) {
		HashMap hashmap = new HashMap();
		hashmap.put("1", "甲");
		hashmap.put("2", "乙");
		hashmap.put("3", "丙");
		hashmap.put("4", "丁");
		/**
		 * Map集合迭代方式1：
		*/
		Iterator it = hashmap.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Entry) it.next();//获取下一个
			String key = (String) entry.getKey();
			String value = (String) entry.getValue();
			System.out.println("key="+key+";"+"value="+value);
		} 
		/**
		 * Map集合迭代方式2：
		 */
		for(Iterator it2 = hashmap.entrySet().iterator();
				it2.hasNext();) {
			Map.Entry entry = (Entry) it2.next();//获取下一个
			String key = (String) entry.getKey();
			System.out.println("key="+key+";"
			+"value="
			+hashmap.get(key));
		}
	}
}
