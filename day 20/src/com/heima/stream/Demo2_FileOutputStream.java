package com.heima.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * FileOutputStream �ڴ��������ʱ�����û���ļ��ͻᴴ��һ��������оͻ����
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		dmeo1();
		
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);  //�������д���ڵڶ��������� ture
		fos.write(192);
		fos.write(238);
		fos.write(192);
		
		
		fos.close();
	}

	private static void dmeo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");    //�����ֽ�������������û�о��Զ�����һ��
//		fos.write(97);                               //��Ȼд������һ��int�������ǵ��ļ��ϵ���һ���ֽڣ����Զ�ȥ��ǰ����8λ
//		fos.write(192);
//		fos.write(238);
		fos.write(100);
		
		fos.close();
	}

}
