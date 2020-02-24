package com.heima.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.Person;



public class Demo3_TreeSet {
	
	/*
	 * TreeSet集合是用来对　对象进行排序的，同样他也可以保证元素唯一
	 * 
	 * 当comparableTo方法返回　０　的时候，集合中只有一个元素
	 * 当comparableTo方法返回　正数　的时候，集合怎么存就怎么取
	 * 当comparableTo方法返回　负数　的时候，集合会倒序存储
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo１();
//		ｄｅｍｏ２();
//		demo3();
//		demo4();
		
		//需求：将字符串按照长度排序
		
		TreeSet<String> ts = new TreeSet<String>(new CompareByLen());      //Comparator c =new Comparator();
		ts.add("aaaaaaaaa");
		ts.add("zz");
		ts.add("b");
		ts.add("aghhh");
		ts.add("aaaahaharfhaaaaaa");
		
		System.out.println(ts);
	}

	private static void demo4() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("周七zag",27));
		ts.add(new Person("张三a",23));
		ts.add(new Person("王三ag",23));
		ts.add(new Person("李四agaha",24));
		ts.add(new Person("王五",25));
		ts.add(new Person("周七",27));
		ts.add(new Person("张三",23));
		ts.add(new Person("王三",23));
		ts.add(new Person("李四",24));
		ts.add(new Person("王五",25));
		ts.add(new Person("赵六",26));
		
		System.out.println(ts);
	}

	private static void demo3() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("周七",27));
		ts.add(new Person("张三",23));
		ts.add(new Person("王三",23));
		ts.add(new Person("李四",24));
		ts.add(new Person("王五",25));
		ts.add(new Person("赵六",26));
		
		System.out.println(ts);
	}

	private static void ｄｅｍｏ２() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("周七",27));
		ts.add(new Person("张三",23));
		ts.add(new Person("王三",23));
		ts.add(new Person("六三",23));
		ts.add(new Person("张三",23));
		ts.add(new Person("李四",24));
		ts.add(new Person("王五",25));
		ts.add(new Person("赵六",26));
		
		System.out.println(ts);
	}

	private static void demo１() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(1);
		ts.add(2);
		ts.add(5);
		ts.add(7);
		ts.add(1);
		ts.add(2);
		ts.add(1);
		ts.add(8);
		ts.add(1);
		ts.add(7);
		
		System.out.println(ts);
	}

}


class CompareByLen implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {    //按照字符串长度比较
		// TODO Auto-generated method stub
		int num = o1.length() - o2.length();       //长度为主要条件
		return num == 0 ? o1.compareTo(o2) : num;  //内容是次要条件
	}
	
}
