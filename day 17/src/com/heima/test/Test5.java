package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {
	
	/*
	 * �Ӽ��̽���һ���ַ�������������������ַ��������������硡�������룺��helloitcast �����ӡ��: acehillostt
	 * 
	 * ������
	 * ��������¼���ַ������ӣ������
	 * ��.���ַ���ת��Ϊ�ַ�������
	 * ��������ԣ���ӣ�����ϣ�����Ƚ������ַ����򲢱����ظ�
	 * ���������ַ����飬��ÿһ���ַ��洢�ڣԣ���ӣ��������
	 * ���������ԣ���ӣ�����ϣ���ӡÿһ���ַ�
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("����һ���ַ�����");
		String line = sc.nextLine();
		
		char[] arr = line.toCharArray();
		
		TreeSet<Character> ts = new TreeSet<Character>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				int num = o1 - o2;       //�Զ�����
				return num == 0 ? 1 : num;
			}
		});
		
//		���������ַ����飬��ÿһ���ַ��洢�ڣԣ���ӣ��������
		for (char c : arr) {
			ts.add(c);               //�Զ�װ��
		}
		
		for (Character c : ts) {
			System.out.print(c);
			
		}
	}

}
