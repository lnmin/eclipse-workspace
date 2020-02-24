package com.heima.test;

import java.io.File;

public class Test4 {

	/**
	 * @param args
	 * 需求：从键盘接收一个文件夹路径，把文件夹中的所有文件以及文件夹的名字按层级打印，例如：
	 * 把文件夹中的所有文件以及文件夹的名字按层级打印
	 * 
	 * 分析：
	 * 1，获取所有文件和文件夹，返回的File数组
	 * 2，遍历数组
	 * 3，无论是文件还是文件夹，都需要直接打印
	 * 4，如果是文件夹，递归调用
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File dir = Test1.getDir();         //获取文件夹路径
		printLev(dir,0);
		
	}

	public static void printLev(File dir, int lev) {
		// TODO Auto-generated method stub
		//把文件夹中的所有文件以及文件夹的名字按层级打印
		File[] subFiles = dir.listFiles();
		//遍历数组
		for (File subfile : subFiles) {
			for(int i =0 ; i <= lev ; i++) {
				System.out.print("\t");
			}
			//无论是文件还是文件夹，都需要直接打印
			System.out.println(subfile);
			//如果是文件夹，递归调用
			if(subfile.isDirectory()) {
				printLev(subfile, lev +1);
			}
			
		}
	}

}
