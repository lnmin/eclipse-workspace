package com.heima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
	/*
		���������������
		
		
		������
		1���������ַ����� �����ַ�������String���͵ı�����
		2���������ڸ�ʽ������
		3���������ַ���ת�������ڶ���
		4��ͨ�����ڶ������ʱ�����ֵ
		5��������ʱ�����ֵ������� 1000���ٳ��� 60 ���ٳ���24 �õ���
		*/
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String birthday = "1997��07��01�� ";
		String today = "2020��05��04��";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd��");
		
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		
		long time = d2.getTime() - d1.getTime();
		
		System.out.println(time / 1000 / 60 / 60 / 24 /365);
		

	}

}
