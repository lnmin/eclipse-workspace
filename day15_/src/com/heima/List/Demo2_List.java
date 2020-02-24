package com.heima.List;

import java.util.ArrayList;
import java.util.List;

import com.heima.bean.Student;

public class Demo2_List {
	/*
	 * 
	 * 向list集合中存储学生对象
	 * 通过size（） 和 get（） 方法结合时使用遍历
	

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add(new Student("张三",23));           //Object obj = new Student(("张三",23));
		list.add(new Student("李四",24));
		list.add(new Student("王五",25));
		list.add(new Student("赵六",26));
		list.add(new Student("张三",23));
		
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));    /通过索引获取每一个元素
			Student s = (Student)list.get(i);
			System.out.println(s.getName() + "   " + s.getAge());
			
		}
	}

}
