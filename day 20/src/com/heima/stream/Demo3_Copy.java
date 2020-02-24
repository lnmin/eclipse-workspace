package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		
		//第二种拷贝，不推荐使用，有可能会导致内存溢出
		FileInputStream fis = new FileInputStream("2001.avi");            //创建输入流对象，关联2001.avi
		FileOutputStream fos = new FileOutputStream("copy.avi");          //创建输出流对象，关联copy.avi
		
//		int len = fis.available();
//		System.out.println(len);
		
		byte[] arr = new byte[fis.available()];              //创建与文件一样大小的字节数组
		fis.read(arr);                                        //将文件上的字节读取到内存中
		fos.write(arr);                                       //将字节数组中的字节数据写到文件上
		
		fis.close();
		fos.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("0101.png");            //创建输入流对象，关联0101.png
		FileOutputStream fos = new FileOutputStream("copy.png");          //创建输出流对象，关联copy.png
		
		int b;
		while( (b = fis.read()) != -1) {                                 //在不断的读取每一个字节
			
			fos.write(b);                                                //将每一个字节写出
		}
		
		
		fis.close();                                                      //关闭释放资源
		fos.close();
	}

}
