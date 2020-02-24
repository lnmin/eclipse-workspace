package com.heima.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo5_FileMethod {

	/**
	 * A:获取功能
	* public String getAbsolutePath()：获取绝对路径
	* public String getPath():获取路径
	* public String getName():获取名称
	* public long length():获取长度。字节数
	* public long lastModified():获取最后一次的修改时间，毫秒值
	* public String[] list():获取指定目录下的所有文件或者文件夹的名称数组
	* public File[] listFiles():获取指定目录下的所有文件或者文件夹的File数组 
     * B:案例演示
	* File类的获取功能
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		
		File dir = new File("E:\\learning\\黑马49期\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))\\day19_video");
		String[] arr = dir.list();                                //仅为了获取文件名
		
		for (String string : arr) {
			System.out.println(string);
		}
		
		File[] subFiles = dir.listFiles();                         //获取文件对象
		for (File file : subFiles) {
			System.out.println(file);
		}
	}

	private static void demo1() {
		File file1 = new File("ccc.txt");
		File file2 = new File("E:\\study\\Java_Study_Demo\\eclipse-workspace\\day 19\\ccc.txt\r\n");
		System.out.println(file1.getAbsolutePath());                     //获取绝对路径
		System.out.println(file2.getAbsolutePath());
		
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());                   //获取构造方法中传入的路径
		
		System.out.println(file1.getName());
		System.out.println(file2.getName());                   //获取文件或者文件的名字
		
		System.out.println(file1.length());
		
		Date d = new Date(file1.lastModified());                 //文件的最后修改时间
		System.out.println(d);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d));
		System.out.println(file1.lastModified());
	}

}
