package com.heima.set;

import java.util.LinkedHashSet;

public class Demo2_LinkedHashSet {
	
	/*
	 * LinkedHashSet
	 * �ײ�������ʵ�ֵģ���Set������Ψһһ���ܱ�֤��ô�����ôȡ�ü��϶���
	 * ��Ϊ��HashSet�����࣬����Ҳ�Ǳ�֤Ԫ��Ψһ�ģ���HashSet��ԭ��һ��
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("a");
		lhs.add("a");
		lhs.add("a");
		lhs.add("b");
		lhs.add("b");
		lhs.add("c");
		lhs.add("c");
		lhs.add("c");
		lhs.add("d");
		lhs.add("d");
	
		System.out.println(lhs);
	}
	

}
