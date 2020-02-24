package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Test1 {

	/**
	 * @param args
	 * 需求：从键盘接收一个文件夹路径，统计该文件夹大小
	 * 
	 *从键盘接收一个文件夹路径
	 * 1，创建一个键盘录入对象
	 * 2，定义一个无限循环
	 * 3，将键盘录入的结果存储并封装成File对象
	 * 4，对File对象判断
	 * 5，将文件夹路径对象返回
	 * 
	 * 统计该文件夹大小
	 * 1，定义一个求和变量
	 * 2，获取该文件夹下所有的文件和文件夹 listFiles();
	 * 3，遍历数组
	 * 4，判断是文件就计算大小并累加
	 * 5，判断是文件夹，递归调用
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*File dir = new File("E:\\study\\Java_Study_Demo\\eclipse-workspace\\verify\\src\\verify\\month");    
		System.out.println(dir.length());         //直接获取文件夹的结果是0
				*/
		File dir = getDir();
		System.out.println(getFileLength(dir));
	}
	
	/*
	 * 从键盘接收一个文件夹路径
	 * 1,返回值类型File
	 * 2，参数列表
	 */
	public static File getDir() {
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径：");
		//定义一个无限循环
		while(true) {
			//将键盘录入的结果存储并封装成File对象
			String line = sc.nextLine();
			File dir = new File(line);
			//对File对象判断
			if(!dir.exists()) {
				System.out.println("您录入的文件夹路径不存在，请输入一个文件夹路径：");
			}else if(dir.isFile()) {
				System.out.println("您录入的文件路径不存在，请输入一个文件夹路径：");
			}else {
				//将文件夹路径对象返回
				return dir;
			}
		}
	}
	
	/*
	 * 统计该文件夹大小
	 * 1,返回值类型long
	 * 2，参数列表File dir
	 * 
	 */
	
	public static long getFileLength(File dir) {
		//定义一个求和变量
		long len = 0;
		//获取该文件夹下所有的文件和文件夹 listFiles();
		File[] subFiles = dir.listFiles();
		//遍历数组
		for (File subfile : subFiles) {
			//判断是文件就计算大小并累加
			if(subfile.isFile()) {
				len = len + subfile.length();
			//判断是文件夹，递归调用
			}else {
				len = len + getFileLength(subfile);
			}
		}
		return len;
	}
	
	
}
