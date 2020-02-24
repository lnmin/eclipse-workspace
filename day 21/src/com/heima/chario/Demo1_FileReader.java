package com.heima.chario;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1_FileReader {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		FileReader fr = new FileReader("xxx.txt");
		int c;
		
		while((c = fr.read()) != -1) {           //通过项目默认的码表一次读取一个字符
			System.out.println((char)c);
		}
		
		fr.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("xxx.txt");
		int x = fr.read();
		System.out.println(x);
		char c = (char)x;
		System.out.println(c);
		fr.close();
	}

}
