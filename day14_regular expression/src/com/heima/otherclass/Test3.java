package com.heima.otherclass;

import java.util.Calendar;
import java.util.Scanner;

public class Test3 {

	/*
	 * 需求：键盘录入任意一个年份，判断该年是闰年还是平年
	 * 
	 * 
	 * 分析：
	 * 1，键盘录入年Scanner
	 * 2,创建	Calendar c =Calendar.getInstance();
	 * 3,通过set方法设置为那一年的3月1号
	 * 4，将日向前减1
	 * 5，判断日是多少天，如果是29天 返回 true 否则 返回false
	 * 
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份，判断该年份是闰年还是平年");
//		int year = sc.nextInt();
		
		String line = sc.nextLine();                     //录入数字字符串
		int year = Integer.parseInt(line);               //将数字字符串转换成数字
		boolean b = getYear(year);
		System.out.println(b);
		
	}

	private static boolean getYear(int year) {
		// TODO Auto-generated method stub
		
		Calendar c = Calendar.getInstance();
		c.set(year,2,1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		
		
		return c.get(Calendar.DAY_OF_MONTH) == 29 ? true : false;
		
	}

}
