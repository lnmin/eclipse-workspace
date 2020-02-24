package com.heima.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

	/**
	 * A:��ȡ����
	* public String getAbsolutePath()����ȡ����·��
	* public String getPath():��ȡ·��
	* public String getName():��ȡ����
	* public long length():��ȡ���ȡ��ֽ���
	* public long lastModified():��ȡ���һ�ε��޸�ʱ�䣬����ֵ
	* public String[] list():��ȡָ��Ŀ¼�µ������ļ������ļ��е���������
	* public File[] listFiles():��ȡָ��Ŀ¼�µ������ļ������ļ��е�File���� 
     * B:������ʾ
	* File��Ļ�ȡ����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		
		File dir = new File("E:\\learning\\����49��\\01-JavaSE֪ʶ(ѧϰ27��)\\day19(�쳣&IO(File��))\\day19_video");
		String[] arr = dir.list();                                //��Ϊ�˻�ȡ�ļ���
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();                         //��ȡ�ļ�����
		for (File file : subFiles) {
			System.out.println(file);
		}
	}

	private static void demo1() {
		File file1 = new File("ccc.txt");
		File file2 = new File("E:\\study\\Java_Study_Demo\\eclipse-workspace\\day 19\\ccc.txt\r\n");
		System.out.println(file1.getAbsolutePath());                     //��ȡ����·��
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());                   //��ȡ���췽���д����·��
		
		System.out.println(file1.getName());
		System.out.println(file2.getName());                   //��ȡ�ļ������ļ�������
		
		System.out.println(file1.length());
		
		Date d = new Date(file1.lastModified());                 //�ļ�������޸�ʱ��
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy��MM��dd�� HH:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(file1.lastModified());
	}

}
