package com.heima.otherclass;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	/*
	 * ���󣺼���¼������һ����ݣ��жϸ��������껹��ƽ��
	 * 
	 * 
	 * ������
	 * 1������¼����Scanner
	 * 2,����	Calendar c =Calendar.getInstance();
	 * 3,ͨ��set��������Ϊ��һ���3��1��
	 * 4��������ǰ��1
	 * 5���ж����Ƕ����죬�����29�� ���� true ���� ����false
	 * 
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ��жϸ���������껹��ƽ��");
//		int year = sc.nextInt();
		
		String line = sc.nextLine();                     //¼�������ַ���
		int year = Integer.parseInt(line);               //�������ַ���ת��������
		boolean b = getYear(year);
		System.out.println(b);
		
	}

	private static boolean getYear(int year) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		
		return c.get(Calendar.DAY_OF_MONTH) == 29 ? true : false;
		
	}

}
