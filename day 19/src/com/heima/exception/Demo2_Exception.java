package com.heima.exception;

public class Demo2_Exception {

	/*
	 * �쳣��������ַ�ʽ��
	 *     a, try...cath...finally
	 * 
	 * 
	 * try:��������쳣
	 * catch:���������쳣
	 * finally:�ͷ��쳣
	 * 
	 * �������������������������try����catch,�����㷢ʲôƢ�����Ҷ��������ܣ�ĬĬ����
	 * ��ͨ��try catch �����⴦���ˣ���������ִ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo2 d = new Demo2();
		try {
			int x = d.div(10, 0);
			System.out.println(x);
			
		}catch(ArithmeticException a){        //ArithmeticException a = new ArithmeticException();
			System.out.println("�����ˣ�����Ϊ0��");
		}
		
	}

}
class Demo2{
	public int div (int a, int b) {
		return a/b;
	}
	
}