package com.heima.test;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * ����һ���ļ�������,����read(byte[] b)����,��a.txt�ļ��е����ݴ�ӡ����(byte�����С����Ϊ5)
	 * 
	 * ������
	 * 1��read(byte[] b) ���ֽ��������ķ���������FileInputStream������a.txt
	 * 2,�����ڴ��������������������д���ڴ��������
	 * 3�������ֽ����飬����Ϊ5
	 * 4�����ڴ������������ȫ��ת��Ϊ�ַ�����ӡ
	 * 5���ر�������
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("a.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		byte[] arr = new byte[5];
		int len;
		while((len = fis.read(arr)) != -1 ) {
			baos.write(arr, 0 ,len);
		}
		
		System.out.println(baos);                      //��ʹû�е��ã��ײ�Ҳ��Ĭ�ϰ����ǵ���toString() ����
		
		fis.close();
	}

}