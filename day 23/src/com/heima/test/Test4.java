package com.heima.test;

import java.io.File;

public class Test4 {

	/**
	 * @param args
	 * ���󣺴Ӽ��̽���һ���ļ���·�������ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ�����磺
	 * ���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ
	 * 
	 * ������
	 * 1����ȡ�����ļ����ļ��У����ص�File����
	 * 2����������
	 * 3���������ļ������ļ��У�����Ҫֱ�Ӵ�ӡ
	 * 4��������ļ��У��ݹ����
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = Test1.getDir();         //��ȡ�ļ���·��
		printLev(dir,0);
		
	}

	public static void printLev(File dir, int lev) {
		// TODO Auto-generated method stub
		//���ļ����е������ļ��Լ��ļ��е����ְ��㼶��ӡ
		File[] subFiles = dir.listFiles();
		//��������
		for (File subfile : subFiles) {
			for(int i =0 ; i <= lev ; i++) {
				System.out.print("\t");
			}
			//�������ļ������ļ��У�����Ҫֱ�Ӵ�ӡ
			System.out.println(subfile);
			//������ļ��У��ݹ����
			if(subfile.isDirectory()) {
				printLev(subfile, lev +1);
			}
			
		}
	}

}
