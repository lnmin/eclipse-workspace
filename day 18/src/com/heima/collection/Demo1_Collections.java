package com.heima.collection;

import java.util.ArrayList;
import java.util.Collections;

public class Demo1_Collections {
	

	/*
	 * Collecti
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//		demo2();
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("v");
		list.add("a");
		list.add("g");
		list.add("d");
		
		System.out.println(Collections.max(list));    //����Ĭ����������ȡ�����е����ֵ
		Collections.reverse(list);                  //��ת����
		System.out.println(list);
		Collections.shuffle(list);                  //����û�����������ϴ��
		System.out.println(list);
	}

	private static void demo2() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("c");
		list.add("v");
		list.add("a");
		list.add("g");
		list.add("d");
		
		System.out.println(Collections.binarySearch(list, "c"));   //�����   
		System.out.println(Collections.binarySearch(list, "b"));   //-2  -(�����)-1
	}

	private static void demo1() {
		ArrayList<String> list = new ArrayList<String>();
		list.add("c");
		list.add("v");
		list.add("a");
		list.add("g");
		list.add("d");
		list.add("d");
		list.add("d");
	
		System.out.println(list);
		Collections.sort(list);                     //����������
		System.out.println(list);
	}

}
