package com.stx.p8;

import java.util.Calendar;
import java.util.Scanner;

public class Demo_p8 {

	/*
	 * ��������ĳ��ĳ�£����������¹��ж����졣����ʾ�� ��Ҫ�ж��������껹��ƽ�꣩
	 * 
	 * ������
	 * 1���жϵ���ݵĶ��·��� 29 �죬�������꣬�������ƽ��
	 * 2�����������Ƕ����죬ͨ���¸���һ�� -1 ʵ�֡�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("��ݣ�");
		int year = sc.nextInt();
		System.out.println("�·ݣ�");
		int month = sc.nextInt();
		getYearMonth(year,month);		
		
	}

	private static void getYearMonth(int year ,int month) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		//����Ϊ�����3��1��
		c.set(year, 2, 1);
		//������ǰ��1
		c.add(Calendar.DAY_OF_MONTH, -1);	
		//�ж��Ƿ���29��
		System.out.println(c.get(Calendar.DAY_OF_MONTH) == 29 ? year + "��һ������" : year + "��һ��ƽ��"); 
		
		//����Ϊ����� month+1 �� 1 ��
		c.set(year,month, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println( "����µ������� " + c.get(Calendar.DAY_OF_MONTH));
	   
	}
	

}
