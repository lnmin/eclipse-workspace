package com.heima.chario;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2_FileWriter {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("yyy.txt");
		fw.write("´ó¼ÒºÃ£¡£¡£¡£¡£¡£¡£¡");
		
		fw.close();
	}

}
