package com.heima.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3_Iterator {

	/*
	 * map���ϵĵڶ��ֵ��������ݼ�ֵ�Զ��󣬻�ȡ����ֵ 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("����", 23);
		map.put("����", 24);
		map.put("����", 25);
		map.put("����", 26);
		
		//Map.Entry˵��Entry��Map���ڲ��ӿڣ�������ֵ��װ����Entry���󣬲��洢��Set������
		/*Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		//��ȡÿһ������
		Iterator<Map.Entry<String, Integer>> it = entrySet.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> en = it.next();     //��������ָ���������
			Entry<String, Integer> en = it.next();         //ֱ�ӻ�ȡ�����������
			String key = en.getKey();                     //���ݼ�ֵ�Զ����ȡ��
			Integer value = en.getValue();                 //���ݼ�ֵ�Զ����ȡֵ
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
