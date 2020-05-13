package com.day07.demo3;

import java.util.ArrayList;
import java.util.Iterator;

public class TPerson {

	public static void main(String[] args) {
		/**
		 * 向集合中添加4个Person对象。
		 * 然后迭代出每个对象
		 */
		Person p = new Person(4,"zs");
		ArrayList list = new ArrayList();
		list.add(p);
		list.add(new Person(5,"ls"));
		list.add(new Person(6,"ls2"));
		for (Iterator iterator = list.iterator();
						iterator.hasNext();) {
			Object object = (Object) iterator.next();
			System.out.println(object);
		}
	}

}
