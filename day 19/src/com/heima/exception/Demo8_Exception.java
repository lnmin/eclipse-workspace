package com.heima.exception;

public class Demo8_Exception {

	/*
	 * ΪʲôҪ�Զ����쳣
	 *     ͨ���������ֵ�����ʲô�쳣
	 *     ���� ���˵�����
	 * �Զ����쳣����
	 *      �̳���Exception
	 *      �̳���RuntimeException
	 *      
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class AgeOutOfBoundsException extends Exception{

	public AgeOutOfBoundsException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AgeOutOfBoundsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	
	
}