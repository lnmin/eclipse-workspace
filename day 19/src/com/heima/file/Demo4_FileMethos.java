package com.heima.file;

import java.io.File;

public class Demo4_FileMethos {

	/**
	 * A:判断功能
	*  public boolean isDirectory():判断是否是目录
	*  public boolean isFile():判断是否是文件
	*  public boolean exists():判断是否存在
	*  public boolean canRead():判断是否可读
	*  public boolean canWrite():判断是否可写
	*  public boolean isHidden():判断是否隐藏
	 * B:案例演示
	*  File类的判断功能
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		
		File file = new File("zzz");
		file.setReadable(false);
		System.out.println(file.canRead());   //Windows系统认为所有的文件都是可读的
		
		file.setWritable(false);
		System.out.println(file.canWrite());   //Windows系统可以设置为不可写
	}

	private static void demo1() {
		File dir1 = new File("ccc");
		System.out.println(dir1.isDirectory());        //判断是否是文件夹
		
		File dir2 = new File("zzz");
		System.out.println(dir2.isDirectory());
		
		System.out.println(dir1.isFile());          //判断是否是文件
		System.out.println(dir2.isFile());
	}

}
