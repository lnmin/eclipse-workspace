package com.heima.list;

import java.util.LinkedList;

public class Demo4_LinkedList {
	
	/*
	 * ��LinkedList ģ��ջ�ṹ
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		Stack s = new Stack();
		s.in("a");                          //��ջ
		s.in("b"); 
		s.in("c");
		s.in("d");
		s.in("e");
		
		while(!s.isEmpty()) {              //�ж�ջ�ṹ�Ƿ�Ϊ��
			System.out.println(s.out());   //��ջ
		}
	}

	private static void demo1() {
		LinkedList list = new LinkedList();             //�������϶���
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
	
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());
		}
	}

}
