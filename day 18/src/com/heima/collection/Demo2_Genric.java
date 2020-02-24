package com.heima.collection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.BaseStudent;
import com.heima.bean.Student;

public class Demo2_Genric {

	/*
	 * ���͹̶��±߽�
	 * ? super E
	 * 
	 * ���͹̶��ϱ߽�
	 * ? extends E
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		TreeSet<Student> ts1 = new TreeSet<Student>(new CompareByAge());
		ts1.add(new Student("����", 22));
		ts1.add(new Student("����", 2));
		ts1.add(new Student("����", 242));
		ts1.add(new Student("����", 24));
		ts1.add(new Student("����", 152));
		
		TreeSet<BaseStudent> ts2 = new TreeSet<>(new CompareByAge());
		ts2.add(new BaseStudent("����", 22));
		ts2.add(new BaseStudent("����", 2));
		ts2.add(new BaseStudent("����", 242));
		ts2.add(new BaseStudent("����", 24));
		ts2.add(new BaseStudent("����", 152));
		
		System.out.println(ts2);
	}

	private static void demo1() {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("����",23));
		list1.add(new Student("����",24));
		
		ArrayList<BaseStudent> list2 = new ArrayList<>();
		list2.add(new BaseStudent("����",25));
		list2.add(new BaseStudent("����",26));
		list2.add(new BaseStudent("����",23));
		
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