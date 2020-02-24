package com.heima.test;

import java.util.HashSet;
import java.util.Scanner;

import javax.print.attribute.HashAttributeSet;

public class Test2 {
	
	/*
	 * 使用Scanner从键盘读取一行输入，去掉其中重复字符，打印出不同的那些字符
	 * 
	 * 分析：
	 * １，创建Ｓｃａｎｎｅｒ对象
	 * ２，创建ＨａｓｈＳｅｔ对象，将字符存储，去掉重复
	 * ３，将字符串转换为字符数组，获取每一个字符存储在ＨａｓｈＳｅｔ集合中，自动去除重复
	 * ４，遍历ＨａｓｈＳｅｔ，打印每一个字符
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一行字符串");
		HashSet<Character> hs = new HashSet<Character>();
//		 ３，将字符串转换为字符数组，获取每一个字符存储在ＨａｓｈＳｅｔ集合中，自动去除重复
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		
		for (char c : arr) {
			hs.add(c);
		}
		
		for (Character ch : hs) {
			System.out.print(ch);
			
		}
	}

}
