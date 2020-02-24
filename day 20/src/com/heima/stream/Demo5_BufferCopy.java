package com.heima.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo5_BufferCopy {

	/**
	 * @param args
	 * @throws IOException 
	 * 
	 * close方法
	 * 具备刷新的功能，在关闭流之前，就会先刷新一次缓冲区，将缓冲区的字节全都刷新到文件上，再关闭，close方法刷新完之后就不能写了
	 * flush方法？
	 * 具备刷新的功能，刷完之后还可以继续写
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		//flush 和 close 方法的区别
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("2001.avi"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.avi"));
		
		int b ;
		while((b = bis.read()) != -1) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
		
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("2001.avi");
		FileOutputStream fos = new FileOutputStream("copy.avi");
		BufferedInputStream bis = new BufferedInputStream(fis);              //创建缓冲区对象，对输入流进行包装让其变得更加强大
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		int b ;
		while((b = bis.read()) != -1 ) {
			bos.write(b);
		}
		
		bis.close();
		bos.close();
	}

}
