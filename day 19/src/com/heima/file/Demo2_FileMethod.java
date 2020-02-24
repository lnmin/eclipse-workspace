package com.heima.file;

import java.io.File;
import java.io.IOException;

public class Demo2_FileMethod {

	/**
	 * * A:创建功能
	*	 public boolean createNewFile():创建文件 如果存在这样的文件，就不创建了
	*	 public boolean mkdir():创建文件夹 如果存在这样的文件夹，就不创建了
	* 	 public boolean mkdirs():创建文件夹,如果父文件夹不存在，会帮你创建出来
    * B:案例演示
	* 	File类的创建功能

	* 	注意事项：
			* 如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下。
	 * @throws IOException 
			
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

//		demo1();
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		
		File dir2 = new File("bbb.txt");     
		System.out.println(dir2.mkdir());
		
		File dir3 = new File("ccc\\ddd");
		System.out.println(dir3.mkdirs());
	}

	private static void demo1() throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile());   //如果没有就创建，返回 true
		
		File file2 = new File("zzz");
		System.out.println(file2.createNewFile());
	}

}
