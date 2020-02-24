package com.heima.collection;

import java.util.ArrayList;
import java.util.Collection;

import com.heima.bean.Student;

public class Demo2_Collection {
	/*
	 * boolean add(E e)
		boolean remove(Object o)
		void clear()
		boolean contains(Object o)
		boolean isEmpty()
		int size()
	 * 
	 * 
	 * add���������List����һֱ������true����ΪList�������ǿ��Դ洢�ظ�Ԫ�ص�
	 * �����Set���� ���洢�ظ����ϵ�ʱ�򣬾ͻ᷵��false
	 * 
	 * ArrayList�ĸ���ĸ�����д��toString�����������ڴ�ӡ��������õ�ʱ������Ľ������Object���е�toString�Ľ��
	 * 
	*/

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		Collection c =new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("e");
		
//		c.remove("c");                //ɾ���ƶ�Ԫ��
     	c.clear();                     //��ռ���
		System.out.println(c.contains("b"));          //�ж��Ƿ����
		System.out.println(c);
		System.out.println(c.isEmpty());             //�ж��Ƿ����
		System.out.println(c.size());                //��ȡ
		
	}

	private static void demo1() {
		Collection c = new ArrayList();         //��������ָ���������
		boolean b1 = c.add("abc");
		boolean b2 = c.add("true");             //�Զ�װ�� new Boolean(true);
		boolean b3 = c.add(100);
		boolean b4 = c.add(new Student("����",23));
		boolean b5 = c.add("abc");
		
		
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);
	
		System.out.println(c);
	}

}
