package com.heima.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/*
	 * 将集合中的重复元素去掉
	 * 
	 * 分析：
	 * １，创建Ｌｉｓt集合存储若干重复元素
	 * ２，单独定义方法去除重复
	 * ３，打印一下Ｌｉｓｔ集合
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("A");
		 list.add("A");
		 list.add("a");
		 list.add("a");
		 list.add("A");
		 list.add("a");
		 list.add("A");
		 
		 getSingle(list);
		 
		 System.out.println(list);
	}

	/*
	 * 分析：
	 * 去除Ｌｉｓｔ集合中的重复元素
	 * １，创建一个LinkedHasSet集合
	 * ２，将Ｌｉｓｔ集合中所有的元素添加到LinkedSet集合
	 * ３，将Ｌｉｓｔ集合中的元素清除
	 * ４，将ＬｉｎｋｅｄＨａｓｈＳｅｔ集合中的元素，添加回Ｌｉｓｔ集合中
	 */
	public static void getSingle(List<String> list) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.addAll(list);
		list.clear();
		list.addAll(lhs);
	}

}
