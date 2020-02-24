package com.heima.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * close����
	 * �߱�ˢ�µĹ��ܣ��ڹر���֮ǰ���ͻ���ˢ��һ�λ������������������ֽ�ȫ��ˢ�µ��ļ��ϣ��ٹرգ�close����ˢ����֮��Ͳ���д��
	 * flush������
	 * �߱�ˢ�µĹ��ܣ�ˢ��֮�󻹿��Լ���д
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		//flush �� close ����������
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("2001.avi"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.avi"));
		
		int b ;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
		
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("2001.avi");
		FileOutputStream fos = new FileOutputStream("copy.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);              //�������������󣬶����������а�װ�����ø���ǿ��
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b ;
		while((b = bis.read()) != -1 ) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}
