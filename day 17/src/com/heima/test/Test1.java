package com.heima.test;

import java.util.HashSet;
import java.util.Random;

public class Test1 {

	/*
	 * ��дһ�����򣬻�ȡ10��1��20���������Ҫ������������ظ����������յ���������������̨
	 * 
	 * ������
	 * 1����Random�ഴ�����������
	 * 2����Ҫ�洢10������������Ҳ����ظ�������������HashSet����
	 * 3�����HashSet��size��С��10�Ϳ��Բ��ϵĴ洢��������ڵ���10��ֹͣ�洢
	 * 4��ͨ��Random���е�nextINT()������ȡ1��20֮����������������Щ������洢��HashSet������
	 * 5������HashSet
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random r =new Random();
		HashSet<Integer> hs = new HashSet<>();

		while(hs.size() < 10) {
			hs.add(r.nextInt(20) + 1);
		}
		
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		
	}

}
