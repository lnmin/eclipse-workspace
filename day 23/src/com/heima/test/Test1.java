package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 * ���󣺴Ӽ��̽���һ���ļ���·����ͳ�Ƹ��ļ��д�С
	 * 
	 *�Ӽ��̽���һ���ļ���·��
	 * 1������һ������¼�����
	 * 2������һ������ѭ��
	 * 3��������¼��Ľ���洢����װ��File����
	 * 4����File�����ж�
	 * 5�����ļ���·�����󷵻�
	 * 
	 * ͳ�Ƹ��ļ��д�С
	 * 1������һ����ͱ���
	 * 2����ȡ���ļ��������е��ļ����ļ��� listFiles();
	 * 3����������
	 * 4���ж����ļ��ͼ����С���ۼ�
	 * 5���ж����ļ��У��ݹ����
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*File dir = new File("E:\\study\\Java_Study_Demo\\eclipse-workspace\\verify\\src\\verify\\month");    
		System.out.println(dir.length());         //ֱ�ӻ�ȡ�ļ��еĽ����0
				*/
		File dir = getDir();
		System.out.println(getFileLength(dir));
	}
	
	/*
	 * �Ӽ��̽���һ���ļ���·��
	 * 1,����ֵ����File
	 * 2�������б�
	 */
	public static File getDir() {
		//��������¼�����
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ļ���·����");
		//����һ������ѭ��
		while(true) {
			//������¼��Ľ���洢����װ��File����
			String line = sc.nextLine();
			File dir = new File(line);
			//��File�����ж�
			if(!dir.exists()) {
				System.out.println("��¼����ļ���·�������ڣ�������һ���ļ���·����");
			}else if(dir.isFile()) {
				System.out.println("��¼����ļ�·�������ڣ�������һ���ļ���·����");
			}else {
				//���ļ���·�����󷵻�
				return dir;
			}
		}
	}
	
	/*
	 * ͳ�Ƹ��ļ��д�С
	 * 1,����ֵ����long
	 * 2�������б�File dir
	 * 
	 */
	
	public static long getFileLength(File dir) {
		//����һ����ͱ���
		long len = 0;
		//��ȡ���ļ��������е��ļ����ļ��� listFiles();
		File[] subFiles = dir.listFiles();
		//��������
		for (File subfile : subFiles) {
			//�ж����ļ��ͼ����С���ۼ�
			if(subfile.isFile()) {
				len = len + subfile.length();
			//�ж����ļ��У��ݹ����
			}else {
				len = len + getFileLength(subfile);
			}
		}
		return len;
	}
	
	
}
