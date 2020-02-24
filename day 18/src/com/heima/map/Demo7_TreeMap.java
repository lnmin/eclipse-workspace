package com.heima.map;

import java.util.Comparator;
import java.util.TreeMap;

import com.heima.bean.Student;

public class Demo7_TreeMap {

	/*
	 * TreeMap���ϼ���Studentֵ��String�İ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		TreeMap<Student, String> tm = new TreeMap<>(new Comparator<Student>() {

			@Override
			public int compare(Student s1, Student s2) {
				// TODO Auto-generated method stub
				int num = s1.getName().compareTo(s2.getName());  //���������Ƚ�
				
				return num == 0 ? s1.getAge() - s2.getAge() : num;
			}
		});
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",23), "��ƽ");
		tm.put(new Student("����",25), "����");
		tm.put(new Student("����",24), "�Ϻ�");
		tm.put(new Student("����",25), "����");
		tm.put(new Student("����",26), "����");
		
		System.out.println(tm);
	}

	private static void demo1() {
		TreeMap<Student, String> tm = new TreeMap<>();
		tm.put(new Student("����",23), "����");
		tm.put(new Student("����",23), "taiyuan");
		tm.put(new Student("����",25), "����");
		tm.put(new Student("����",24), "�Ϻ�");
		tm.put(new Student("����",25), "����");
		tm.put(new Student("����",26), "����");
		
		System.out.println(tm);
	}

}
