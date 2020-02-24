package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;
@SuppressWarnings({ "rawtypes", "unchecked" })

public class Demo3_Collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		
		Collection c =new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		
		Object[] arr = c.toArray();        //将集合装换位数组
		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
			Student s = (Student)arr[i];                      //向下转型
			System.out.println(s.getName() + "   " + s.getAge());
			
		}
		
		
	}

	@SuppressWarnings("unused")
	private static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		
	   Object[] arr = c.toArray();     //将集合装换位数组
	   for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	}

}
