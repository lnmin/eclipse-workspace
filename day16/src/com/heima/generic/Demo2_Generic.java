package com.heima.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo2_Generic {

	/*
	 * ArrayList �洢�ַ������������Ͱ�
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		ArrayList<Person> list = new ArrayList<>();
		list.add(new Person("����",23));
		list.add(new Person("����",2));
		list.add(new Person("����",25));
		list.add(new Person("����",23));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
			Person p = it.next();                 //�������е�ÿһ��Ԫ���ãУ������¼
			System.out.println(p.getName() + "  " +p.getAge());
		}
		

	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<String>();  //�������϶���
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("a");

		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
