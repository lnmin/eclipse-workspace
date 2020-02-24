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
		
		System.out.println(Collections.max(list));    //根据默认排序结果获取集合中的最大值
		Collections.reverse(list);                  //反转集合
		System.out.println(list);
		Collections.shuffle(list);                  //随机置换，可以用来洗牌
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
		
		System.out.println(Collections.binarySearch(list, "c"));   //插入点   
		System.out.println(Collections.binarySearch(list, "b"));   //-2  -(插入点)-1
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
		Collections.sort(list);                     //将集合排序
		System.out.println(list);
	}

}
