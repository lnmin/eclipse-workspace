package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {
	
	/*
	 * ��һ�������д洢���������ظ����ַ���������һ�����������������ֵ����򣩣����һ�����ȥ���ظ�
	 * 
	 * ������
	 * ��������һ��List���ϣ����洢�ظ���������ַ���
	 * �������巽�������������ظ�
	 * ������ӡ�̣�������
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
	 * ���巽�������򲢱����ظ�
	 * 
	 * ������
	 * ��������TreeSet���϶�����Ϊ����String�;߱��ȽϹ��ܣ������ظ����ᱣ�������������ñȽ���
	 * ������List���������е�Ԫ����ӵ�TreeSet�����У��������򣬱����ظ�
	 * �������List����
	 * ������TreeSet��������õ�Ԫ����ӵ��������
	 */
	public static void sort(ArrayList<String> list) {
		// TODO Auto-generated method stub
		TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				// TODO Auto-generated method stub
				int num = s1.compareTo(s2);            //�Ƚ�����Ϊ��Ҫ����
				return num == 0 ? 1 : num;              //�����ظ�
			}
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}


