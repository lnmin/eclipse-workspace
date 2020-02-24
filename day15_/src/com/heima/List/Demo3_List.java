package com.heima.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Demo3_List {
	/*
	 * 需求：我有一个集合，请问，我想判断里面有没有"world"这个元素，如果有，我就添加一个"javaee"元素，请写代码实现。

		
		*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		list.add("a");                    //Object obj = new String();
		list.add("v");
		list.add("world");
		list.add("a");
		list.add("sg");
		list.add("aag");
		
		/*Iterator it = list.iterator();    //获取迭代器
		while(it.hasNext()) {             //判断集合中是否有元素
			String str = (String)it.next();  //向下转型
			if("world".equals(str)) {
				list.add("javaee");          //遍历的同时在增加元素，并发修改
			}
		}*/
		
		ListIterator lit = list.listIterator();   //获取迭代器（List集合特有）
        while(lit.hasNext()) {
        	String str = (String)lit.next();       //向下转型
        	if("world".equals(str)) {
//        		list.add("javaee");              
                lit.add("javaee");        	
        	}
        }
		System.out.println(list);
		
	}

}
