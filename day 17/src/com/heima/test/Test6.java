package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	/*
	 * 程序启动后，可以从键盘输入接收多个整数，知道输入quit是结束输入，把所有输入的整数倒序排列打印。
	 * 
	 * 分析：
	 * １，创建Ｓｃａｎｎｅｒ对象，键盘录入
	 * ２，创建ＴｒｅｅＳｅｔ集合对象，ＴｒｅｅＳｅｔ集合中传入比较器
	 * ３，无限循环不断的接收整数，遇到ｑｕｉｔ退出，因为退出市ｑｕｉｔ所以键盘录入的时候，都以字符串的形式录入
	 * ４，判断是ｑｕｉｔ就退出，不是将其转换为Integer,并添加到集合
	 * ５，遍历TreeSet集合并打印每一个元素
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
//				int num = o2 - o1;                //自动拆箱
				int num = o2.compareTo(o1);
				return num == 0 ? 1 : num;
			}
		});
		
//		 * ３，无限循环不断的接收整数，遇到ｑｕｉｔ退出，因为退出市ｑｕｉｔ所以键盘录入的时候，都以字符串的形式录入
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
//			４，判断是ｑｕｉｔ就退出，不是将其转换为Integer,并添加到集合
			try {
				Integer i = Integer.parseInt(line);
				ts.add(i);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("录入错误，请您录入整数：");
			}
		}
		
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
