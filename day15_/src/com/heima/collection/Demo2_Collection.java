package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

public class Demo2_Collection {
	/*
	 * boolean add(E e)
		boolean remove(Object o)
		void clear()
		boolean contains(Object o)
		boolean isEmpty()
		int size()
	 * 
	 * 
	 * add方法如果是List集合一直都返回true，因为List集合中是可以存储重复元素的
	 * 如果是Set集合 当存储重复集合的时候，就会返回false
	 * 
	 * ArrayList的父类的父类重写了toString方法，所以在打印对象的引用的时候，输出的结果不是Object类中的toString的结果
	 * 
	*/

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		Collection c =new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		
//		c.remove("c");                //删除制定元素
     	c.clear();                     //清空集合
		System.out.println(c.contains("b"));          //判断是否包含
		System.out.println(c);
		System.out.println(c.isEmpty());             //判断是否清空
		System.out.println(c.size());                //获取
		
	}

	private static void demo1() {
		Collection c = new ArrayList();         //父类引用指向子类对象
		boolean b1 = c.add("abc");
		boolean b2 = c.add("true");             //自动装箱 new Boolean(true);
		boolean b3 = c.add(100);
		boolean b4 = c.add(new Student("张三",23));
		boolean b5 = c.add("abc");
		
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	
		System.out.println(c);
	}

}
