package com.heima.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo2_Generic {

	/*
	 * ArrayList 存储字符串并遍历范型版
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("张三",23));
		list.add(new Person("李四",2));
		list.add(new Person("王五",25));
		list.add(new Person("张三",23));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();                 //将集合中的每一个元素用Ｐｅｒｓｏｎ记录
			System.out.println(p.getName() + "  " +p.getAge());
		}
		

	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<String>();  //创建集合对象
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");

		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
