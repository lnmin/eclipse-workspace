package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeMap;

public class Test3 {

	/**
	 * @param args
	 * 获取一个文本上每个字符出现的次数,将结果写在times.txt上
	 * 
	 * 分析：
	 * 1，创建带缓冲的输入流对象
	 * 2，创建双类集合对象 
	 * 3，将读到的字符存储在双列集合中，存储的时候要判断，如果不包含这个键，就将键和1存储，如果包含这个键，就将该键和值加1存储
	 * 4，关闭输入流
	 * 5，创建输出流
	 * 6，遍历集合将集合中的内容写到time。txt中
	 * 7，关闭输出流
	 * @throws IOException 
	 * 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("zzz.txt"));
		
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();
		
		int ch;
		while((ch = br.read()) != -1) {
			char c = (char)ch;     //强制性转换
			/*if(!tm.containsKey(c)) {
				tm.put(c, 1);
			}else {
				tm.put(c, tm.get(c) + 1);             //tm.get(c)  键的值
			}*/
			tm.put(c, !tm.containsKey(c) ? 1 : tm.get(c) + 1);
		}
		
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("time.txt"));
		
		for (Character key : tm.keySet()) {             //tm.keySet() 键的集合
			switch (key) {
			case '\t':
				bw.write( "\\t=" + tm.get(key));
				break;
			
			case '\n':
				bw.write( "\\n=" + tm.get(key));
				break;
				
			case '\r':
				bw.write( "\\r=" + tm.get(key));
			default:
				bw.write(key + "=" + tm.get(key));            //写出键和值
				break;
			}
			         
			bw.newLine();
		}
		
		bw.close();
	}

}
