package com.heima.list;

import java.util.LinkedList;

public class Demo3_LinkedList {
	/*
	 * A:LinkedList类概述
*      B:LinkedList类特有功能
	* public void addFirst(E e)及addLast(E e)
	* public E getFirst()及getLast()
	* public E removeFirst()及public E removeLast()
	* public E get(int index);
	 * 
	 * 
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList list =new LinkedList();
		list.addFirst("A");
		list.addFirst("B");
		list.addFirst("C");
		list.addFirst("D");
		
		list.addLast("a");
		list.addLast("b");
		list.addLast("c");
		list.addLast("d");
		
		System.out.println(list);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.removeLast());
		System.out.println(list);
		System.out.println(list.get(1));
		
		
		
	}

}
