package com.heima.exception;

import java.io.FileInputStream;

public class Demo4_Exception {
	/*
	 * ����ʱ�쳣 Ҳ������Ϊ�� δ������쳣��
	 *      δ����ѣ�����ĳЩ�����ʱ��Ҫ��ĳЩ׼��
	 *      ����ʱ�쳣���ڱ���ĳ������ʱ���п��ܻ����������������鷢���������ļ��Ҳ������������쳣�ͱ����ڱ����ʱ����������������ͨ����
	 *      
	 *      ����ʱ�쳣�����ǳ���Ա�����Ĵ�����Ҫ�����޸Ĵ���
	 *      
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			
			FileInputStream fis = new FileInputStream("xxx.txt");
		}catch(Exception e) {
			
		}
	}

}
