package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 * ��д�����ֽ������һ�����������������Կ�����ܵ�ʱ���ٴ����Ϳ�����
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("0101.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.png"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123);                //������Կ 123.  ����������Ǳ���
		}
		
		bis.close();
		bos.close();
	}

}
