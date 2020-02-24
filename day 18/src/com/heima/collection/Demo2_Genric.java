package com.heima.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.BaseStudent;
import com.heima.bean.Student;

public class Demo2_Genric {

	/*
	 * 范型固定下边界
	 * ? super E
	 * 
	 * 范型固定上边界
	 * ? extends E
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		TreeSet<Student> ts1 = new TreeSet<Student>(new CompareByAge());
		ts1.add(new Student("张三", 22));
		ts1.add(new Student("赵六", 2));
		ts1.add(new Student("王五", 242));
		ts1.add(new Student("领悟", 24));
		ts1.add(new Student("阿嘎", 152));
		
		TreeSet<BaseStudent> ts2 = new TreeSet<>(new CompareByAge());
		ts2.add(new BaseStudent("张三", 22));
		ts2.add(new BaseStudent("赵六", 2));
		ts2.add(new BaseStudent("王五", 242));
		ts2.add(new BaseStudent("领悟", 24));
		ts2.add(new BaseStudent("阿嘎", 152));
		
		System.out.println(ts2);
	}

	private static void demo1() {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("张三",23));
		list1.add(new Student("李四",24));
		
		ArrayList<BaseStudent> list2 = new ArrayList<>();
		list2.add(new BaseStudent("王五",25));
		list2.add(new BaseStudent("赵六",26));
		list2.add(new BaseStudent("王五",23));
		
		System.out.println(list2);
	}

}

class CompareByAge implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		int num = o1.getAge() - o2.getAge();
		return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
	}
	
}