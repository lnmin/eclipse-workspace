package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	/**
	 * @param args
	 * @throws IOException 
	 * read()方法读取的是一个字节,为什么返回是int,而不是byte
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		FileInputStream fis = new FileInputStream("xxx.txt");
		int b ;
		while ((b = fis.read()) != -1 ) {
			System.out.println(b);
		}
		
		fis.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("xxx.txt");
		int x = fis.read();                  //从硬盘上读取一个字节
		System.out.println(x);
		int y = fis.read();
		System.out.println(y);
		int z = fis.read();
		System.out.println(z);
		fis.close();                         //关流释放资源
	}

}
