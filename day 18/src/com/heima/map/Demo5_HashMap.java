package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo5_HashMap {

	/*
	 * ������ʾ��
	 * HashMap���ϼ���Studentֵ��String�İ���
	 * 
	 * ����ѧ�����󣬴���ÿһ��ѧ��
	 * ֵ���ַ������󣬴���ѧ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("����",23), "����");
		hm.put(new Student("����",23), "taiyuan");
		hm.put(new Student("����",25), "����");
		hm.put(new Student("����",24), "�Ϻ�");
		hm.put(new Student("����",25), "����");
		hm.put(new Student("����",26), "����");
		
		System.out.println(hm);
	}

}
