package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		//�ڶ��ֿ��������Ƽ�ʹ�ã��п��ܻᵼ���ڴ����
		FileInputStream fis = new FileInputStream("2001.avi");            //�������������󣬹���2001.avi
		FileOutputStream fos = new FileOutputStream("copy.avi");          //������������󣬹���copy.avi
		
//		int len = fis.available();
//		System.out.println(len);
		
		byte[] arr = new byte[fis.available()];              //�������ļ�һ����С���ֽ�����
		fis.read(arr);                                        //���ļ��ϵ��ֽڶ�ȡ���ڴ���
		fos.write(arr);                                       //���ֽ������е��ֽ�����д���ļ���
		
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("0101.png");            //�������������󣬹���0101.png
		FileOutputStream fos = new FileOutputStream("copy.png");          //������������󣬹���copy.png
		
		int b;
		while( (b = fis.read()) != -1) {                                 //�ڲ��ϵĶ�ȡÿһ���ֽ�
			
			fos.write(b);                                                //��ÿһ���ֽ�д��
		}
		
		
		fis.close();                                                      //�ر��ͷ���Դ
		fos.close();
	}

}
