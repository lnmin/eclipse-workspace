package com.heima.test;

import java.io.File;

public class Test2 {

	/**
	 * @param args
	 * 需求：从键盘接收一个文件夹路径，删除该文件
	 * 
	 * 删除该文件：
	 * 分析：
	 * 1，获取该文件夹下所有的文件和文件夹
	 * 2，遍历数组
	 * 3，判断是文件直接删除
	 * 4，如果是文件夹，递归调用
	 * 5，循环结束后，把空文件夹删掉
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		File dir = new File("E:\\study\\Java_Study_Demo\\eclipse-workspace\\day 23\\day23_video");
//		dir.delete();            //实现不了
		File dir = Test1.getDir();           //获取文件夹路径
		deleteFile(dir);
	}
	
	/*
	 * 删除文件夹
	 * 1，返回值类型void
	 * 2，参数列表File dir
	 * 
	 */
	public static void deleteFile(File dir) {
		//获取该文件夹下所有的文件和文件夹
		File[] subFiles = dir.listFiles();
		//遍历数组
		for (File subfile : subFiles) {
			//判断是文件直接删除
			if(subfile.isFile()) {
				subfile.delete();
			//如果是文件夹，递归调用	
			}else {
				deleteFile(subfile);
			}
		}
		//循环结束后，把空文件夹删掉
		dir.delete();
 	}

}
