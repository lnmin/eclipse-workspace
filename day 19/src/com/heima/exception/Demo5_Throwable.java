package com.heima.exception;

public class Demo5_Throwable {

	/*
	 * Throwable�ļ�����������
	 *      a: getMessage()
	 *          ��ȡ�쳣��Ϣ�������ַ���
	 *      b: toString()
	 *          ��ȡ�쳣����쳣��Ϣ�������ַ���
	 *      c�� printStackTrace()
	 *          ��ȡ�쳣�������쳣��Ϣ���Լ��쳣�����ڳ����е�λ�ã�����ֵ void
	 *          
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println( 1/0);
		} catch (Exception e) {        //Exception e = new ArithmeticException("/by zero") 
			// TODO: handle exception
//			System.out.println(e.getMessage());    //��ȡ�쳣��Ϣ
//			System.out.println(e.toString());      //����toString��������ӡ�쳣�������쳣��Ϣ
			e.printStackTrace();                     //jvmĬ�Ͼ��������쳣
		}
	}

}
