package com.heima.test;

import java.util.HashMap;

public class Test1 {
	
	/*
	 * ͳ���ַ�����ÿ���ַ����ֵĴ���
	 * 
	 * ������
	 * 1������һ����Ҫ��ͳ���ַ����ַ���
	 * 2�����ַ���ת��Ϊ�ַ�����
	 * 3������˫�м��ϣ��洢�ַ������ַ��Լ��ַ����ֵĴ���
	 * 4�������ַ������ȡÿһ���ַ��������ַ��洢��˫�м�����
	 * 5���洢������Ҫ���жϣ���������а�����������ͽ����ַ���������ֵΪ1�洢����������а�����������ͽ�ֵ��1�洢
	 * 6����ӡ˫�м��ϣ���ȡ�ַ����ִ���
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "aaaaabbbbcccaaacddd";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
//		4�������ַ������ȡÿһ���ַ��������ַ��洢��˫�м�����
		for (char c : arr) {
//			�洢������Ҫ���жϣ���������в�������������ͽ����ַ���������ֵΪ1�洢����������а�����������ͽ�ֵ��1�洢
			/*if(!hm.containsKey(c)) {      //��������������
				hm.put(c, 1);
				
			}else {
				hm.put(c, hm.get(c) + 1);
			}*/
			hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c) + 1);
			
		}
		//��ӡ˫�м��ϣ���ȡ�ַ����ִ���
		for (Character key : hm.keySet()) {              //hm.keySet() �������м��ļ���
			System.out.println(key + "= " + hm.get(key));//hm.get(key)���ݼ���ȡֵ
		}
	}

}
