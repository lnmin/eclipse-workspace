package com.heima.test;

import java.util.HashMap;

public class Test1 {
	
	/*
	 * 统计字符串中每个字符出现的次数
	 * 
	 * 分析：
	 * 1，定义一个需要被统计字符的字符串
	 * 2，将字符串转换为字符数组
	 * 3，定义双列集合，存储字符串中字符以及字符出现的次数
	 * 4，遍历字符数组获取每一个字符，并将字符存储在双列集合中
	 * 5，存储过程中要做判断，如果集合中包含这个键，就将该字符当作键，值为1存储，如果集合中包含这个键，就将值加1存储
	 * 6，打印双列集合，获取字符出现次数
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaaaabbbbcccaaacddd";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
//		4，遍历字符数组获取每一个字符，并将字符存储在双列集合中
		for (char c : arr) {
//			存储过程中要做判断，如果集合中不包含这个键，就将该字符当作键，值为1存储，如果集合中包含这个键，就将值加1存储
			/*if(!hm.containsKey(c)) {      //如果不包含这个键
				hm.put(c, 1);
				
			}else {
				hm.put(c, hm.get(c) + 1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
			
		}
		//打印双列集合，获取字符出现次数
		for (Character key : hm.keySet()) {              //hm.keySet() 代表所有键的集合
			System.out.println(key + "= " + hm.get(key));//hm.get(key)根据键获取值
		}
	}

}
