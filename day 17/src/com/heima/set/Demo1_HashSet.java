package com.heima.set;

import java.util.HashSet;

import com.heima.bean.Person;

public class Demo1_HashSet {
	/*
	 * Set���ϣ����������������ظ�������
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("����",23));
		hs.add(new Person("����",23));
		hs.add(new Person("����",24));
		hs.add(new Person("����",24));
		hs.add(new Person("����",23));
		
//		System.out.println(hs.size());
		System.out.println(hs);
		
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<String>();      //����HashSet����
		boolean b1 = hs.add("a");
		boolean b2 = hs.add("a");                   //����set�����д洢�ظ�Ԫ�ص�ʱ�򷵻�false
		hs.add("c");
		hs.add("d");
		hs.add("g");
		hs.add("h");
		
	    System.out.println(hs);                     //HashSet�ļ̳���ϵ������дtoString����
		System.out.println(b2);
		
		for (String string : hs) {                  //ֻҪ���õ����������ģ��Ϳ���ʹ����ǿ����ѭ������
			System.out.println(string);
		}
	}

}
