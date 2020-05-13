package com.day06.demo;

public class T4 {
	/**
	 * Int与Integer
			  1、int是java的一种基本数据类型，Integer是int的
			          包装类
	 		  2、Integer变量必须实例化后才能使用，int不需要
	 		  3、Integer实际是对象的引用，new Integer()实际
	 		  是生成一个指针指向此对象。Int是直接存储数值
	 		  4、Integer的默认值是null,int默认值是0
	 		  
	 * @param args
	 */
	public static void main(String[] args) {
		String i = "1";
		int l = Integer.valueOf(i);
		Integer integer = new Integer(3);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("输出35的二进制表示"
					+Integer.toBinaryString(35));
		
		Integer n = new Integer(4);
		int l2 = n;
		System.out.println(l2);
		
		dem01();
		demo02();
		demo03();
		demo04();
	}

	private static void demo04() {
		/**
		 * java在编译Integer a = 128的时候，会
		 * 把这行代码翻译成 Integer i = Integer.valueOf(128)
		 * 自动装箱后的Integer的对象其值-128<=x<=127时，
		 * 这个对象会直接取缓存IntegerCache中的对应的对象，
		 * 生成的也是个对象
		 * 
		 * a和b都是128,不会再IntegerCache取缓存对象。
		 * 所以false
		 */
		Integer a = 127;
		
		Integer b = 127;
		System.out.println(a==b);
	}

	private static void demo03() {
		/**
		 * 非new生成的Integer变量指向的是
		 * java常量池中的对象。
		 * 而new Intger()生成的变量指向堆中新建的对象。
		 * 2者内存地址是不一样的。
		 */
		Integer a = new Integer(100);
		Integer b = 100;
		System.out.println(a==b);
	}

	private static void demo02() {
		/**
		 * int和integer在进行比较时，Integer会
		 * 进行拆箱。转为int值与int进行比较
		 */
		Integer a = new Integer(100);
		int b = 100;
		System.out.println(a==b);
		
	}

	private static void dem01() {
		Integer a  = new Integer(100);
		Integer b = new Integer(100);
		System.out.println(a==b);//==号2两边如果时引用类型
		//用于比较地址值是否相等
	}
}
