package com.heima.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * FileOutputStream 在创建对象的时候，如果没有文件就会创建一个，如果有就会清空
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		dmeo1();
		
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);  //如果想续写就在第二个参数传 ture
		fos.write(192);
		fos.write(238);
		fos.write(192);
		
		
		fos.close();
	}

	private static void dmeo1() throws FileNotFoundException, IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt");    //创建字节输出流对象，如果没有就自动创建一个
//		fos.write(97);                               //虽然写出的是一个int数，但是到文件上的是一个字节，会自动去除前三个8位
//		fos.write(192);
//		fos.write(238);
		fos.write(100);
		
		fos.close();
	}

}
