package com.heima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Iterator {

	/*
	 * 通过查看Map集合的API发现没有iterator方法，那么双列集合如何迭代
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		Integer i = map.get("张三");    //根据键获取值
		System.out.println(i);
		
		
		//获取所有的键
		/*Set<String> keySet = map.keySet();  //获取所有键的集合
		Iterator<String> it = keySet.iterator();   //获取迭代器
		while(it.hasNext()) {                     //判断集合中是否有元素
			String key = it.next();             //获取每一个键
			Integer value = map.get(key);       //根据键获取值
			System.out.println(key + "=" + value);
			
		}*/
		
		//使用增强for循环遍历
		for (String key : map.keySet()) {        //map.keySet() 是所有键的集合
			System.out.println(key + "= " + map.get(key));
			
		}
		
		
		
		
	}

}
