package com.heima.collection;


import java.util.ArrayList;
import java.util.Collection;

public class Demo_CollectionAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
//		dmeo3();
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   ����
//		c2.add("a");
//		c2.add("b");
		c2.add("z");
		
//		ȡ������������õļ��ϸı�ͷ���true��������õļ��ϲ���ͷ���false
		boolean b = c1.retainAll(c2);                  //ȡ����
		System.out.println(b);
		System.out.println(c1);

		
	}

	private static void dmeo3() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   ����
		c2.add("a");
		c2.add("b");
		c2.add("b");
	
		boolean b = c1.containsAll(c2);                 //�жϵ��õļ����Ƿ�������˵ļ���
		System.out.println(b);
	}

	private static void demo2() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   ����
		c2.add("a");
		c2.add("b");
	
		boolean b = c1.removeAll(c2);                   //ɾ�����ǽ���
		System.out.println(b);
		System.out.println(c1);
	}

	private static void demo1() {
		Collection c1 = new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 = new ArrayList();                //alt + shift + r   ����
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		
		c1.addAll(c2);                                  //��c2�е�    ��ӵ� c1��
		c1.add(c2);                                     //��c2����һ��������ӵ� c1��
		System.out.println(c1);
	}

}
