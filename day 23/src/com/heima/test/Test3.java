package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	/**
	 * @param args
	 * ���󣺴Ӽ��̽��������ļ���·����������һ���ļ����У��������ݣ���������һ���ļ�����
	 * 
	 * ������һ���ļ����У��������ݣ���������һ���ļ�����
	 * ������
	 * 1����Ŀ���ļ����д���ԭ�ļ���
	 * 2����ȡԭ�ļ��������е��ļ����ļ��У��洢��File������
	 * 3����������
	 * 4��������ļ�����io����д
	 * 5��������ļ��о͵ݹ����
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File src = Test1.getDir();
		File dest = Test1.getDir();
		if(src.equals(dest)) {
			System.out.println("Ŀ���ļ�����ԭ�ļ��е����ļ���");
		}else {
			
			copy(src,dest);
		}
	}
	/*
	 * ������һ���ļ����У��������ݣ���������һ���ļ�����
	 * 1������ֵ����void
	 * 2�������б� File src ��File dest
	 */
	public static void copy(File src, File dest) throws IOException {
		// TODO Auto-generated method stub
		//��Ŀ���ļ����д���ԭ�ļ���
		File newDir = new File(dest, src.getName());
		newDir.mkdir();
		//��ȡԭ�ļ��������е��ļ����ļ��У��洢��File������
		File[] subFiles = src.listFiles();
		//��������
		for (File subFile : subFiles) {
			if(subFile.isFile()) {
				//������ļ�����io����д
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subFile));
				BufferedOutputStream bos = 
						new BufferedOutputStream(new FileOutputStream(new File(newDir,subFile.getName())));
				int b ;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			//������ļ��о͵ݹ����
			}else {
				copy(subFile,newDir);
			}
		}
 	}

}
