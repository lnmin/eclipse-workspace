package com.heima.test;

import java.util.HashSet;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class Test2 {
	
	/*
	 * ʹ��Scanner�Ӽ��̶�ȡһ�����룬ȥ�������ظ��ַ�����ӡ����ͬ����Щ�ַ�
	 * 
	 * ������
	 * ���������ӣ���������
	 * ���������ȣ���ӣ�����󣬽��ַ��洢��ȥ���ظ�
	 * �������ַ���ת��Ϊ�ַ����飬��ȡÿһ���ַ��洢�ڣȣ���ӣ�������У��Զ�ȥ���ظ�
	 * ���������ȣ���ӣ������ӡÿһ���ַ�
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		HashSet<Character> hs = new HashSet<Character>();
//		 �������ַ���ת��Ϊ�ַ����飬��ȡÿһ���ַ��洢�ڣȣ���ӣ�������У��Զ�ȥ���ظ�
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		
		for (char c : arr) {
			hs.add(c);
		}
		
		for (Character ch : hs) {
			System.out.print(ch);
			
		}
	}

}
