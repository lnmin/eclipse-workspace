package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {
	
	/*
	 * 从键盘接收一个字符串，程序对其中所有字符串进行排序，例如　键盘输入：　helloitcast 程序打印　: acehillostt
	 * 
	 * 分析：
	 * １，键盘录入字符串，Ｓｃａｎｎｅｒ
	 * ２.将字符串转换为字符串数组
	 * ３，定义ＴｒｅｅＳｅｔ集合，传入比较器对字符排序并保留重复
	 * ４，遍历字符数组，将每一个字符存储在ＴｒｅｅＳｅｔ集合中
	 * ５，遍历ＴｒｅｅＳｅｔ集合，打印每一个字符
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个字符串：");
		String line = sc.nextLine();
		
		char[] arr = line.toCharArray();
		
		TreeSet<Character> ts = new TreeSet<Character>(new Comparator<Character>() {

			@Override
			public int compare(Character o1, Character o2) {
				// TODO Auto-generated method stub
				int num = o1 - o2;       //自动拆箱
				return num == 0 ? 1 : num;
			}
		});
		
//		４，遍历字符数组，将每一个字符存储在ＴｒｅｅＳｅｔ集合中
		for (char c : arr) {
			ts.add(c);               //自动装箱
		}
		
		for (Character c : ts) {
			System.out.print(c);
			
		}
	}

}
