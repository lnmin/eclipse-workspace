package com.heima.generic;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo1_Generic {
	
	/*
	 *  A:���͸���
* B:���ͺô�
	* ��߰�ȫ��(�������ڵĴ���ת����������) 
	* ʡȥǿת���鷳
* C:���ͻ���ʹ��
	* <>�зŵı����������������� 
* D:����ʹ��ע������
	* ǰ��ķ��ͱ���һ��,���ߺ���ķ��Ϳ���ʡ�Բ�д(1.7�����������η���) 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		ArrayList<Person> list = new ArrayList<Person>();
		
	}

	private static void demo1() {
		ArrayList<Person> list = new ArrayList<Person>();
//		list.add(110);
//		list.add(true);
		list.add(new Person("����",22));
		list.add(new Person("����",24));
		
		Iterator<Person> it = list.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next());
//            Person p = (Person)it.next();    //����ת��
			Person p =it.next();
            System.out.println(p.getName() + "   " + p.getAge());
            
		}
	}

}
