package com.heima.otherclass;

import java.util.Date;

public class Demo6_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		Date d1 = new Date();
		d1.setTime(1000);                     //���ú���ֵ���ı�ʱ�����
		System.out.println(d1);

	}

	private static void demo2() {
		Date d1 = new Date();
		System.out.println(d1.getTime());                     //ͨ��ʱ������ȡ����ֵ
		System.out.println(System.currentTimeMillis());       //ͨ��ϵͳ��ķ�����ȡ��ǰʱ�����ֵ
	}

	private static void demo1() {
		Date d1 = new Date();       //util�µİ�
		System.out.println(d1);
		
		Date d2 = new Date(0);     //������췽���в�����Ϊ0�� ������� 1970��1��1��
		System.out.println(d2);    //ͨ������ֵ����ʱ�����
	}

}
