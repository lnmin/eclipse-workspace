package com.heima.exception;

public class Demo7_Finally {

	/*
	 * finally �����ͷ���Դ����IO�����������ݿ�����л����
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(10 / 2);
		}catch(Exception e) {
			System.out.println("����Ϊ����");
			System.exit(0);           //�˳�jvm�����
		}finally {
			System.out.println("������ִ������");
		}
	}

}
