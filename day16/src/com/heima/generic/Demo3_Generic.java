package com.heima.generic;

import com.heima.bean.Student;
import com.heima.bean.Tool;

public class Demo3_Generic {
	/*
	 * 
	 */

	public static <Worker> void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		Tool<String> t =new Tool<>();
//		t.show("aga");
		t.show("afg");
		t.show(true);
	}

	private static void demo1() {
		Tool<Student> t = new Tool();          //创建工具类对象
		t.setObj(new Student("zhangsan",23));
		
//		Worker w = (Worker) t.getObj();     //向下转型
//		System.out.println(w);
	}

}
