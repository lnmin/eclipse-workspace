package com.heima.otherio;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo02_ByteArrayOutput {

	/**
	 * @param args
	 * ByteArrayOutputStream
	 * �ڴ������
	 * 
	 * FileInputStream��ȡ���ĵ�ʱ�����������
	 * 
	 * ���������
	 * 1���ַ���
	 * 2��ByteArrayOutputStream
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("d.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();        //���ڴ��д����˿����������ڴ�����
		
		int b;
		while ((b = fis.read()) != -1) {
			baos.write(b);                                    //����ȡ�����������д���ڴ���
			
		}
//		byte[] arr = baos.toByteArray();                      //��������������ȫ����ȡ����������ֵ��arr����
//		System.out.println(new String(arr));
		
		System.out.println(baos.toString());                 //��������������ת��Ϊ�ַ��������������п���ʡ�Ե�ȡ����
		fis.close();
	}

}
