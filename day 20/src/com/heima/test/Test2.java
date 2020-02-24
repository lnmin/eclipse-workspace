package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	/**
	 * @param args
	 * 
	 * 在控制台录入文件的路径,将文件拷贝到当前项目下
	 * 
	 * 分析：
	 * 1，创建键盘录入对象
	 * 2，定义方法，对键盘录入的路径进行判断，如果是文件就返回
	 * 3，在主方法中接受该文件
	 * 4，读和写该文件
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file = getFile();
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(file.getName()));
		
		int b ;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}
	/*
	 * 定义一个方法获取键盘录入的文件路径，并封装成File对象返回
	 * 
	 * 1，返回值类型File
	 * 2,参数列表无
	 * 
	 */
	public static File getFile() {
		Scanner sc = new Scanner(System.in);           //键盘录入对象
		System.out.println("请输入一个文件的路径：");
		while(true) {
			String line = sc.nextLine();              //接收键盘录入的路径
			File file = new File(line);               //封装成File 对象，并对其进行判断
			if(!file.exists()) {
				System.out.println("您录入的文件路径不存在，请重新录入：");
			}else if(file.isDirectory()) {
				System.out.println("您录入的是文件夹路径，请重新录入：");
			}else {
				return file;
			}
		}
	}
}
