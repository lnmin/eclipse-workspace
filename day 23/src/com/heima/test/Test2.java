package com.heima.test;

import java.io.File;

public class Test2 {

	/**
	 * @param args
	 * ���󣺴Ӽ��̽���һ���ļ���·����ɾ�����ļ�
	 * 
	 * ɾ�����ļ���
	 * ������
	 * 1����ȡ���ļ��������е��ļ����ļ���
	 * 2����������
	 * 3���ж����ļ�ֱ��ɾ��
	 * 4��������ļ��У��ݹ����
	 * 5��ѭ�������󣬰ѿ��ļ���ɾ��
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File dir = new File("E:\\study\\Java_Study_Demo\\eclipse-workspace\\day 23\\day23_video");
//		dir.delete();            //ʵ�ֲ���
		File dir = Test1.getDir();           //��ȡ�ļ���·��
		deleteFile(dir);
	}
	
	/*
	 * ɾ���ļ���
	 * 1������ֵ����void
	 * 2�������б�File dir
	 * 
	 */
	public static void deleteFile(File dir) {
		//��ȡ���ļ��������е��ļ����ļ���
		File[] subFiles = dir.listFiles();
		//��������
		for (File subfile : subFiles) {
			//�ж����ļ�ֱ��ɾ��
			if(subfile.isFile()) {
				subfile.delete();
			//������ļ��У��ݹ����	
			}else {
				deleteFile(subfile);
			}
		}
		//ѭ�������󣬰ѿ��ļ���ɾ��
		dir.delete();
 	}

}
