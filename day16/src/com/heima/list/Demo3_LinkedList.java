package com.heima.list;

import java.util.LinkedList;

public class Demo3_LinkedList {
	/*
	 * A:LinkedList�����
*      B:LinkedList�����й���
	* public void addFirst(E e)��addLast(E e)
	* public E getFirst()��getLast()
	* public E removeFirst()��public E removeLast()
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
