package com.heima.list;

import java.util.LinkedList;

public class Demo4_LinkedList {
	
	/*
	 * 用LinkedList 模拟栈结构
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		Stack s = new Stack();
		s.in("a");                          //进栈
		s.in("b"); 
		s.in("c");
		s.in("d");
		s.in("e");
		
		while(!s.isEmpty()) {              //判断栈结构是否为空
			System.out.println(s.out());   //弹栈
		}
	}

	private static void demo1() {
		LinkedList list = new LinkedList();             //创建集合对象
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
	
		while(!list.isEmpty()) {
			System.out.println(list.removeLast());
		}
	}

}
