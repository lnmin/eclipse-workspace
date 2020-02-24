package com.heima.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.heima.bean.Student;

public class Demo7_TreeMap {

	/*
	 * TreeMap集合键是Student值是String的案例
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s1.getName().compareTo(s2.getName());  //按照姓名比较
				
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("张三",23), "北平");
		tm.put(new Student("张三",25), "无锡");
		tm.put(new Student("李四",24), "上海");
		tm.put(new Student("王五",25), "广州");
		tm.put(new Student("赵六",26), "深圳");
		
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("张三",23), "北京");
		tm.put(new Student("张三",23), "taiyuan");
		tm.put(new Student("张三",25), "无锡");
		tm.put(new Student("李四",24), "上海");
		tm.put(new Student("王五",25), "广州");
		tm.put(new Student("赵六",26), "深圳");
		
		System.out.println(tm);
	}

}
