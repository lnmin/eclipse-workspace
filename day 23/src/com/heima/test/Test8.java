package com.heima.test;

import java.util.ArrayList;

public class Test8 {

	/**
	 * @param args
	 * Լɪ��
	 * 
	 * ��������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getLucklyNum(8));
	}
	
	/*
	 * ��ȡ��������
	 * 1������ֵ���� int
	 * 2�������б� int num
	 * 
	 */
	public static int getLucklyNum(int num) {
		ArrayList<Integer> list = new ArrayList<>();       //�������ϴ洢1��num�Ķ���
		for (int i = 1; i <= num; i++) {
			list.add(i);                                   //��1��num�洢�ڼ�����
		}
		
		int count = 1;           //���������ģ�ֻҪ��3�ı�����ɱ��
		for (int i = 0; list.size() != 1; i++) {        //ֻҪ��������������1����Ҫ����ɱ
			if(i == list.size()) {                    //���i������������������+1ʱ
				i = 0;                                //���¹���
			}
			
			if(count % 3 == 0) {                    //�����3�ı���
				list.remove(i--);                     //��ɱ��
			}
			count++;
		}
		return list.get(0);
	}

}