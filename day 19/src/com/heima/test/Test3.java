package com.heima.test;

import java.io.File;
import java.io.FilenameFilter;

public class Test3 {

	/**
	 * 需求：判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File dir = new File("C:\\Users\\lnmin\\Documents\\Tencent Files\\78246686\\Image\\C2C");
		
		/*String[] arr = dir.list();                     //获取E盘下所有的文件和文件夹
		for (String string : arr) {
			if(string.endsWith(".png")) {
				System.out.println(string);
			}
		}*/
		
		/*File[] subFiles = dir.listFiles();      //获取该盘下所有的文件和文件夹对象
		
		for (File file : subFiles) {
			if(file.isFile() && file.getName().endsWith(".jpg")) {
				System.out.println(file);
			}
			
		}*/
		
	    String[] arr = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				File file = new File(dir, name);
				return file.isFile() && file.getName().endsWith(".jpg");
			}
		});
	    
	    for (String string : arr) {
			System.out.println(string);
		}
		
		
	}

}
