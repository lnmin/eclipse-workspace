package com.heima.List;

import java.util.ArrayList;
import java.util.List;

import com.heima.bean.Student;

public class Demo2_List {
	/*
	 * 
	 * ��list�����д洢ѧ������
	 * ͨ��size���� �� get���� �������ʱʹ�ñ���
	

	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add(new Student("����",23));           //Object obj = new Student(("����",23));
		list.add(new Student("����",24));
		list.add(new Student("����",25));
		list.add(new Student("����",26));
		list.add(new Student("����",23));
		
		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));    /ͨ��������ȡÿһ��Ԫ��
			Student s = (Student)list.get(i);
			System.out.println(s.getName() + "   " + s.getAge());
			
		}
	}

}
