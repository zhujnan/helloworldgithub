package com.day07.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class T1 {
	public static void main(String[] args) {
		/**
		 * 程序=数据+操作数据的算法(分支/循环)
		 */
		int num = 1;
		int[] arry = {1,2,3};
		/**
		 * 1.数组中存放的数据类型都一致。
		 * 2.数组的元素数量固定，创建时指定。
		 * 
		 * java还提供了另外一种数据的存储，集合。
		 */
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		/**
		 * 1.集合迭代方式1
		 */
		for (Iterator iterator = list.iterator(); 
				iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
		/**
		 * 2.集合迭代方式2
		 */
		
		/**
		 * 3.集合与数组的转换
		 */
		Object[] arryList = list.toArray();
		/**
		 * 4.在集合指定下标位置，添加元素。
		 */
		list.add(0, "0");
		iteratorList(list);
		/**
		 * 5.判断集合是否包含指定元素
		 */
		//System.out.println(list.contains("0"));
		/**
		 * 6.将集合a添加到集合list中
		 */
		ArrayList a = new ArrayList();
		a.add(5);
		a.add(6);
		a.add(7);
		list.add(a);
		//iteratorList(list);
		System.out.println("判断集合list是否包含集合a"
				+list.containsAll(a));
		
	}
	public static void iteratorList(ArrayList collection) {
		System.out.println("集合迭代：");
		for(int i=0;i<collection.size();i++) {
			System.out.println(collection.get(i));
		}
	}
}
