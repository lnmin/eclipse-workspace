package com.heima.file;

import java.io.File;

public class Demo1_File {

	/**
	 * 
	 *File(String pathname)������һ��·���õ�File����
	* File(String parent, String child):����һ��Ŀ¼��һ�����ļ�/Ŀ¼�õ�File����
	* File(File parent, String child):����һ����File�����һ�����ļ�/Ŀ¼�õ�File����
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//		dmeo2();
		File parent = new File("E:\\learning\\����49��\\01-JavaSE֪ʶ(ѧϰ27��)\\day19(�쳣&IO(File��))");
		String chils = "day19_video";
		File file = new File(parent, chils);
		System.out.println(file.exists());
	}

	private static void dmeo2() {
		String parent = "E:\\\\learning\\\\����49��";
		String child = "01-JavaSE֪ʶ(ѧϰ27��)\\\\day19(�쳣&IO(File��))\\\\day19_video";
		
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	private static void demo1() {
		File file = new File("E:\\learning\\����49��\\01-JavaSE֪ʶ(ѧϰ27��)\\day19(�쳣&IO(File��))\\day19_video");
		System.out.println(file.exists());
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());
	}

}
