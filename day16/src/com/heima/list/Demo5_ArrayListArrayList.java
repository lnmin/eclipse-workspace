package com.heima.list;

import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo5_ArrayListArrayList {
	
	/*
	 *  ����Ƕ��֮ArrayListǶ��ArrayList
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ArrayList<Person>> list = new ArrayList<>();
		
		ArrayList<Person> first = new ArrayList<Person>();    //������һ���༶
		first.add(new Person("���",354));
		first.add(new Person("�׾���",784));
		first.add(new Person("��ά",304));
		first.add(new Person("����ʯ",340));
		first.add(new Person("������",415));
		
		ArrayList<Person> second = new ArrayList<Person>();
		second.add(new Person("����",23));
		second.add(new Person("�����",23));
		second.add(new Person("����",23));
		second.add(new Person("dgag",23));
		
		//���༶��ӵ�ѧ�Ƽ�����
		list.add(first);
		list.add(second);
		
		//����ѧ�Ƽ���
		for (ArrayList<Person> a : list) {
			for (Person p : a) {
				System.out.println(p);
			}
		}
	}

}
