package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo8_HashMap {

	/*
	 * ����Ƕ��֮HashMapǶ��HashMap
	 * 
	 * ����
	 * ���˼�У�кܶ������
	 * ��88�ڻ����ඨ���һ��˫�м��ϣ�����ѧ������ֵ��ѧ���Ĺ�����
	 * ��89�ڻ����ඨ���һ��˫�м��ϣ�����ѧ������ֵ��ѧ���Ĺ�����
	 * 
	 * ������88 ���� 89 �ڶ��ǰ༶��������Ϊ�˱���ͳһ��������Щ�༶������ӵ���У������
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����88�ڻ�����
		HashMap<Student, String> hm88 = new HashMap<Student, String>();
		hm88.put(new Student("����", 23), "����");
		hm88.put(new Student("����", 23), "̫ԭ");
		hm88.put(new Student("����", 25), "����");
		hm88.put(new Student("����", 24), "�Ϻ�");
		hm88.put(new Student("����", 25), "����");
		hm88.put(new Student("����", 26), "����");
		// ����89�ڻ�����
		HashMap<Student, String> hm89 = new HashMap<Student, String>();
		hm89.put(new Student("����", 23), "����");
		hm89.put(new Student("����", 25), "̫ԭ");
		hm89.put(new Student("����", 26), "����");
		hm89.put(new Student("����", 36), "�Ϻ�");

		// �����У
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hm88, "��88�ڻ�����");
		hm.put(hm89, "��89�ڻ�����");

		// ����˫�м���
		for (HashMap<Student, String> jiaxiao_class : hm.keySet()) { // hm.keySet() �������˫�м����м��ļ���
			String value = hm.get(jiaxiao_class);                         //get(jiaxiao)���ݼ������ȡֵ����
			//��������˫�м��϶���
			for (Student key : jiaxiao_class.keySet()) {      //jiaxiao_class.keySet()��ȡ���������е�ѧ��������
				String value2 = jiaxiao_class.get(key);
				
				System.out.println(key + "= " + value2 + "= " + value);
			}

		}
	}

}
