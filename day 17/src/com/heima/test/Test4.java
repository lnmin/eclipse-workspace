package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {
	
	/*
	 * 在一个集合中存储了无序并且重复的字符串，定义一个方法，让其有序（字典排序），而且还不能去除重复
	 * 
	 * 分析：
	 * １，定义一个List集合，并存储重复的无序的字符串
	 * ２，定义方法对其排序保留重复
	 * ３，打印Ｌｉｓｔ集合
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list = new ArrayList<String>();
		list.add("aaa");
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("dddd");
		list.add("aaa");
		list.add("ffff");
		list.add("ffff");
		list.add("aaa");
		list.add("heima");
		list.add("ggg");
		list.add("ayaa");
		
		sort(list);
		
		System.out.println(list);
	}

	/*
	 * 定义方法，排序并保留重复
	 * 
	 * 分析：
	 * １，创建TreeSet集合对象，因为本身String就具备比较功能，但是重复不会保留，所以我们用比较器
	 * ２，将List集合中所有的元素添加到TreeSet集合中，对其排序，保留重复
	 * ３，清空List集合
	 * ４，将TreeSet集合排序好的元素添加到ｌｉｓｔ中
	 */
	public static void sort(ArrayList<String> list) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				int num = s1.compareTo(s2);            //比较内容为主要条件
				return num == 0 ? 1 : num;              //保留重复
			}
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}


