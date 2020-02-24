package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.heima.bean.Student;

public class Demo5_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		
		Collection c = new ArrayList();
		c.add(new Student("张三",23));              // Object obj = new Student("张三",23);
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		
		//获取迭代器
		Iterator it = c.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
            Student s = (Student)it.next();        //向下转型  
            System.out.println(s.getName() + "   " + s.getAge());
		}
		
		
	}

	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//对集合中的元素进行迭代
		Iterator it = c.iterator();          //获取迭代器
		/*boolean b1 = it.hasNext();           //判断集合中是否有元素，有就返回true
		Object obj1 = it.next();
		System.out.println(b1);
		System.out.println(obj1);
		
		boolean b2 = it.hasNext();           //判断集合中是否有元素，有就返回true
		Object obj2 = it.next();
		System.out.println(b2);
		System.out.println(obj2);*/
		 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
