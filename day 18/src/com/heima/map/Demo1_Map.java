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
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		Collection<Integer> c = map.values();   //��ȡ����������ֵ�ļ���
		System.out.println(c);
		Collection<String> s = map.keySet();
		System.out.println(s);
		System.out.println(map.size());          //���ؼ����м�ֵ�Եĸ���
	}

	private static void demo2() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
//		Integer value = map.remove("����");    //���ݼ�ɾ��ֵ�����ؼ���Ӧ��ֵ
//		System.out.println(value);
		System.out.println(map.containsKey("����"));  //�ж��Ƿ��������ļ�
		System.out.println(map.containsValue(100));  //�ж��Ƿ���������ֵ
		System.out.println(map);
	}

	private static void demo1() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer i1 = map.put("����", 23);
		Integer i2 = map.put("����", 24);
		Integer i3 = map.put("����", 25);
		Integer i4 = map.put("����", 26);
		Integer i5 = map.put("����", 26);    //��ͬ�ļ����洢��ֵ���ǣ��ѱ����ǵ�ֵ����
		
		System.out.println(map);
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}
