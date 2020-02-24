package com.heima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {

	/*
	 * map集合的第二种迭代，根据键值对对象，获取键和值 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("张三", 23);
		map.put("李四", 24);
		map.put("王五", 25);
		map.put("赵六", 26);
		
		//Map.Entry说明Entry是Map的内部接口，将键和值封装成了Entry对象，并存储在Set集合中
		/*Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//获取每一个对象
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> en = it.next();     //父类引用指向子类对象
			Entry<String, Integer> en = it.next();         //直接获取的是子类对象
			String key = en.getKey();                     //根据键值对对象获取键
			Integer value = en.getValue();                 //根据键值对对象获取值
			System.out.println(key + "=" + value);
		}*/
		
		/*for (Map.Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "=" + en.getValue());
		}*/

		for (Entry<String, Integer> en : map.entrySet()) {
			System.out.println(en.getKey() + "=" + en.getValue());
		}
		
	}

}
