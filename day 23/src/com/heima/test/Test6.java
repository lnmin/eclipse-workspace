package com.heima.test;

import java.math.BigInteger;

public class Test6 {

	/**
	 * @param args
	 * �������1000�Ľ׳˺�β����ĸ��������õݹ���
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��Ϊ1000�׳�ԶԶ����int��ȡֵ��Χ�����Բ�����int ����BigInteger
//		demo1();
		
		demo2();
	}

	private static void demo2() {             //��ȡ1000�Ľ׳�β���ж��ٸ���
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+ "");
			bi1 = bi1.multiply(bi2);        //��bi1��bi2��˵Ľ����ֵ��bi1
		}
		String str = bi1.toString();       //��ȡ�ַ���������ʽ
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();      //��ʽ���
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			}else {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static void demo1() {               //��1000�Ľ׳������е���
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+ "");
			bi1 = bi1.multiply(bi2);        //��bi1��bi2��˵Ľ����ֵ��bi1
		}
		String str = bi1.toString();       //��ȡ�ַ���������ʽ
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('0' == str.charAt(i)) {     //����ַ����г��� 0 �ַ�
				count++;                   //��������1
			}
		}
		 
		System.out.println(count);
	}

}
