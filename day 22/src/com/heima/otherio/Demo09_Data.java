package com.heima.otherio;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;





public class Demo09_Data {

	/**
	 * @param args
	 * 数据的输入输出流，
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		DataInputStream dis = new DataInputStream(new FileInputStream("h.txt"));
		int x = dis.readInt();
		int y = dis.readInt();
		int z = dis.readInt();
		int m = dis.readInt();
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(m);
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("h.txt"));
		dos.writeInt(9987);
		dos.writeInt(987);
		dos.writeInt(997);
		dos.writeInt(977);
		
		dos.close();
	}

}
