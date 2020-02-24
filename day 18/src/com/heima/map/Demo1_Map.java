package com.heima.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//		demo2();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		Collection<Integer> c = map.values();   //获取集合中所有值的集合
		System.out.println(c);
		Collection<String> s = map.keySet();
		System.out.println(s);
		System.out.println(map.size());          //返回集合中键值对的个数
	}

	private static void demo2() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
//		Integer value = map.remove("张三");    //根据键删除值，返回键对应的值
//		System.out.println(value);
		System.out.println(map.containsKey("张三"));  //判断是否包含传入的键
		System.out.println(map.containsValue(100));  //判断是否包含传入的值
		System.out.println(map);
	}

	private static void demo1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer i1 = map.put("张三", 23);
		Integer i2 = map.put("李四", 24);
		Integer i3 = map.put("王五", 25);
		Integer i4 = map.put("赵六", 26);
		Integer i5 = map.put("张三", 26);    //相同的键不存储，值覆盖，把被覆盖的值返回
		
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}
