package com.heima.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
//		demo3();
		
		//��ʱ���ַ���ת�������ڶ���
		String str = "2000��08��06�� 08:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		Date d = sdf.parse(str);                 //��ʱ���ַ���ת�������ڶ���
		System.out.println(d);
	}

	private static void demo3() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");   //�������ڸ�ʽ�������
		System.out.println(sdf.format(d));                                  //�����ڶ���ת�����ַ���
	}

	private static void demo2() {
		Date d = new Date();                     //��ȡ��ǰʱ��
		SimpleDateFormat sdf = new SimpleDateFormat(); //�������ڸ�ʽ�������
		System.out.println(sdf.format(d));          //20-1-9 ����8:12
	}

	private static void demo1() {
		//DateFormat df = new DateFormat();    //DateFormat�ǳ����࣬������ʵ���� 
		//DateFormat df1 = new SimpleDateFormat();  
		
		DateFormat df1 = DateFormat.getDateInstance(); //�൱�ڸ�������ָ���������,�ұߵķ�������һ���������
	}

}
