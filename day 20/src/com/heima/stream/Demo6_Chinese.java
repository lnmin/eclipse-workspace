package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo6_Chinese {

	/**
	 * @param args
	 * �ֽ�����ȡ���ĵ�����
	* �ֽ����ڶ����ĵ�ʱ���п��ܻ�����������,������� 
	* �ֽ���д�����ĵ�����
	* �ֽ���ֱ�Ӳ������ֽ�,����д�����ı��뽫�ַ���ת�����ֽ����� 
	* д���س����� write("\r\n".getBytes());
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		FileOutputStream fos = new FileOutputStream("xxx.txt");
		fos.write("�Ҷ����٣�".getBytes());
		fos.write("\r\n".getBytes());
		fos.close();
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		byte[] arr = new byte[4];
		int len;
		while((len = fis.read(arr)) != -1) {
			System.out.println(new String(arr, 0 ,len));
		}
		
		fis.close();
	}

}
