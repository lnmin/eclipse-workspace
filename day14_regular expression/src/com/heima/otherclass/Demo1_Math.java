package com.heima.otherclass;

public class Demo1_Math {
	
	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.abs(-10));   //ȡ����ֵ
		
		
		
		//ceil �컨��
		/*
		 * 13.0
		 * 12.3
		 * 12.0
		
		*/
		System.out.println(Math.ceil(12.3));  //����ȡ�������ǽ����һ��double
		System.out.println(Math.ceil(12.99));
		
		//floor�ذ�
		System.out.println(Math.floor(2.3));  //����ȡ�������ǽ����һ��double
		
		
		//��ȡ����ֵ�е����ֵ
		System.out.println(Math.max(20, 10));
		
		//ǰ������ǵ��������������ָ��
		System.out.println(Math.pow(2, 3));     //2.0 ^ 3.0
		
		//����0.0 �� 1.0 ֮�������С��������0.0 ��������1.0
		System.out.println(Math.random());
		
		//��������
		System.out.println(Math.round(12.3f));
		System.out.println(Math.round(12.9f));
		
		
		System.out.println(Math.sqrt(4));
		
	}
	

}
