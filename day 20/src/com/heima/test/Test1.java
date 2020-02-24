package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	/**
	 * @param args
	 * @throws IOException 
	 * 将写出的字节异或上一个数，这个数就是密钥，解密的时候再次异或就可以了
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("0101.png"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.png"));
		
		int b;
		while((b = bis.read()) != -1) {
			bos.write(b ^ 123);                //设置密钥 123.  异或再异或就是本身
		}
		
		bis.close();
		bos.close();
	}

}
