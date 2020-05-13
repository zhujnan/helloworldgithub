package com.day07.demo3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		Object[] arryList = list.toArray();
		//集合转换成数组
		
		int[] arry = {1,2,3,4};
		List arryList2 = Arrays.asList(arry);
		//数组转换成集合
		
		
	}

}
