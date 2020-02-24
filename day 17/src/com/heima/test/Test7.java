package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import com.heima.bean.Student;

public class Test7 {

	/*
	 * ���󣺼���¼�롡������ѧ����Ϣ�����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ����������ִܷӸߵ����������̨
	 * 
	 * ������
	 * ��������һ��ѧ����
	 * ��������Ա���������������ĳɼ�����ѧ�ɼ���Ӣ��ɼ����ܳɼ�
	 * ��������Ա�������ղΣ��вι��죬�вι���Ĳ��������������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�
	 * ������������toString�������ڱ��������е�Student�������õ�ʱ�����ʾ����ֵ
	 * ��������¼����Ҫ�ӣ�����򣬴�������¼�����
	 * ���������ԣ���ӣ�����϶����ڣԣ���ӣ���Ĺ��췽���д���Ƚ����������ֱܷȽ�
	 * ����¼�룵��ѧ���������Լ����е�ѧ������Ϊ�ж������������������С�ڣ��ͽ��д洢
	 * ������¼����ַ����и�ö����и�᷵��һ���ַ������飬���ַ��������дӶ���Ԫ��ת���ɣ������飬
	 * ������ת����Ľ����װ�ɣӣ�����������󣬽��ӣ����������ӵ��ԣ���ӣ��������
	 * ���������ԣ�ee�ӣ�����ϴ�ӡÿһ���ӣ������������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ���ɼ���ʽ�ǣ����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�");
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num = o2.getSum() - o1.getSum();
				return num == 0 ? 1 : num;
			}
		});
//		����¼�룵��ѧ���������Լ����е�ѧ������Ϊ�ж������������������С�ڣ��ͽ��д洢
		while(ts.size() < 5) {
//			��¼����ַ����и�ö����и�᷵��һ���ַ������飬���ַ��������дӶ���Ԫ��ת���ɣ������飬
			String line = sc.nextLine();
			try {
				String[] arr = line.split(",");
				int chinese = Integer.parseInt(arr[1]);
				int math = Integer.parseInt(arr[2]);
				int english = Integer.parseInt(arr[3]);
//			��ת����Ľ����װ�ɣӣ�����������󣬽��ӣ����������ӵ��ԣ���ӣ��������
				ts.add(new Student(arr[0],chinese,math,english));
				
			}catch(Exception e) {
				System.out.println("��ʽ������ȷ�ĸ�ʽ�ǣ����������ĳɼ�����ѧ�ɼ���Ӣ��ɼ�");
			}
				
			}
		
		System.out.println("������ѧ����Ϣ��");
		for (Student s : ts) {
			System.out.println(s);
		}
	}

}
