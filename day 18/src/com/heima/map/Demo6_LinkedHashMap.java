package com.heima.map;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Demo6_LinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
		lhm.put("张三", 23);
		lhm.put("李四", 24);
		lhm.put("赵六", 26);
		lhm.put("王五", 25);
		
		System.out.println(lhm);
	}

}
