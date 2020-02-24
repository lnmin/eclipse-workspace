package com.heima.collection;


import java.util.ArrayList;
import java.util.Collection;

public class Demo_CollectionAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
//		dmeo3();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   改名
//		c2.add("a");
//		c2.add("b");
		c2.add("z");
		
//		取交集，如果调用的集合改变就返回true，如果调用的集合不变就返回false
		boolean b = c1.retainAll(c2);                  //取交集
		System.out.println(b);
		System.out.println(c1);

		
	}

	private static void dmeo3() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   改名
		c2.add("a");
		c2.add("b");
		c2.add("b");
	
		boolean b = c1.containsAll(c2);                 //判断调用的集合是否包含传人的集合
		System.out.println(b);
	}

	private static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   改名
		c2.add("a");
		c2.add("b");
	
		boolean b = c1.removeAll(c2);                   //删除的是交集
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   改名
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);                                  //将c2中的    添加到 c1中
		c1.add(c2);                                     //将c2看成一个对象添加到 c1中
		System.out.println(c1);
	}

}
