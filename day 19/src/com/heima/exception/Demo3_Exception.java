package com.heima.exception;

public class Demo3_Exception {

	/*
	 * try...catch �������쳣
	 * 
	 * JDK7�Ժ������쳣�ķ�ʽ��ע������
	 * 
	 * ��׿���ͻ��˿�������δ����쳣�� try{}catch(Exception e){}
	 * ee,����˿�����һ�㶼�ǵײ㿪�����ӵײ�������
	 * 
	 * try�����������catch����ôС���쳣��ǰ�棬����쳣�ź��棬���ݶ�̬��ԭ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		//JDK7��δ������쳣
		
		try {
			System.out.println(a / b);
			
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException e) {
			System.out.println("������");
		}
	}

	private static void demo1() {
		int a = 10;
		int b = 0;
		int[] arr = {11,22,33,44,55};
		
		try {
			System.out.println(a / b);
			
		}catch(ArithmeticException e) {
			System.out.println("��������Ϊ0");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("����Խ��");
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("������");
		}
		
		System.out.println("over");
	}

}
