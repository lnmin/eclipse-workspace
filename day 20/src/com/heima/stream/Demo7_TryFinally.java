package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo7_TryFinally {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		try (                              //自动调用close
			FileInputStream fis = new FileInputStream("xxx.txt");
			FileOutputStream fos = new FileOutputStream("yyy.txt");
			MyClose m = new MyClose();
			
		){
			
			int b ;
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		}
		
		
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("xxx.txt");
			fos = new FileOutputStream("yyy.txt");
		
			int b ;
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		}finally {
			try {
				if(fis != null)
					fis.close();
			}finally {                          //try finally 的嵌套目的是能关一个就关一个
				if(fos != null)
					fos.close();
			}
			
			
		}
	}

}

class MyClose implements AutoCloseable{
	public void close() {
		System.out.println("我关了");
	}
}




