package com.heima.file;

import java.io.File;

public class Demo1_File {

	/**
	 * 
	 *File(String pathname)：根据一个路径得到File对象
	* File(String parent, String child):根据一个目录和一个子文件/目录得到File对象
	* File(File parent, String child):根据一个父File对象和一个子文件/目录得到File对象
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//		dmeo2();
		File parent = new File("E:\\learning\\黑马49期\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))");
		String chils = "day19_video";
		File file = new File(parent, chils);
		System.out.println(file.exists());
	}

	private static void dmeo2() {
		String parent = "E:\\\\learning\\\\黑马49期";
		String child = "01-JavaSE知识(学习27天)\\\\day19(异常&IO(File类))\\\\day19_video";
		
		File file = new File(parent, child);
		System.out.println(file.exists());
	}

	private static void demo1() {
		File file = new File("E:\\learning\\黑马49期\\01-JavaSE知识(学习27天)\\day19(异常&IO(File类))\\day19_video");
		System.out.println(file.exists());
		
		File file2 = new File("xxx.txt");
		System.out.println(file2.exists());
	}

}
