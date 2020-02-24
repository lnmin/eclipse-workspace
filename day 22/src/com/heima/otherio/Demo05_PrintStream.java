package com.heima.otherio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.heima.bean.Person;

public class Demo05_PrintStream {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		demo1();
		PrintWriter pw = new PrintWriter(new FileOutputStream("f.txt"), true);
		pw.write(97);
//		pw.println(97);             //自动
		
//		pw.close();
	}

	private static void demo1() {
		System.out.println("aaa");
		PrintStream ps = System.out;           //获取标准输出流
		ps.println(97);                     //底层通过Integer.toString()将97转换成字符串并打印
		ps.write(97);                       //查找码表，找到对应的a并打印
		
		Person p1 = new Person("张三", 23);
		ps.println(p1);                          //默认调用p1的toString方法
		
		Person p2 = null;               //打印引用数据类型，如果是null，就打印null，如果不是null就打印对象的toString
		ps.println(p2);
		ps.close();
	}

}
