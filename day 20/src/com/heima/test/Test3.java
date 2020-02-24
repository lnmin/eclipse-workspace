package com.heima.test;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test3 {

	/**
	 * @param args
	 * * 将键盘录入的数据拷贝到当前项目下的text.txt文件中,键盘录入数据当遇到quit时就退出

		分析：
		1，创建键盘录入对象
		2，创建输出流对象，关联text.txt文件
		3，定义无线循环
		4，遇到quit退出循环
		5，如果不quit，就将内容写出
		6，关闭流
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = new FileOutputStream("text.txt");
		System.out.println("请输入数据：");
		
		while(true) {
			String line = sc.nextLine();
			if("quit" .equals(line)) {
				break;
			}
			fos.write(line.getBytes());                       //字符串写出必须转换成字节数组
			fos.write("\r\n".getBytes());
		}
		
		fos.close();
	}

}
