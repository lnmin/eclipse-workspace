package com.heima.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Test3 {

	/*
	 * �������е��ظ�Ԫ��ȥ��
	 * 
	 * ������
	 * ���������̣��t���ϴ洢�����ظ�Ԫ��
	 * �����������巽��ȥ���ظ�
	 * ������ӡһ�£̣�������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		 ArrayList<String> list = new ArrayList<String>();
		 list.add("A");
		 list.add("A");
		 list.add("a");
		 list.add("a");
		 list.add("A");
		 list.add("a");
		 list.add("A");
		 
		 getSingle(list);
		 
		 System.out.println(list);
	}

	/*
	 * ������
	 * ȥ���̣��������е��ظ�Ԫ��
	 * ��������һ��LinkedHasSet����
	 * �������̣������������е�Ԫ����ӵ�LinkedSet����
	 * �������̣��������е�Ԫ�����
	 * �������̣�����ȣ���ӣ�������е�Ԫ�أ���ӻأ̣���������
	 */
	public static void getSingle(List<String> list) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.addAll(list);
		list.clear();
		list.addAll(lhs);
	}

}
