package com.stx.p8;

import java.util.Calendar;
import java.util.Scanner;

public class Demo_p8 {

	/*
	 * 键盘输入某年某月，请输出这个月共有多少天。（提示： 需要判断年是闰年还是平年）
	 * 
	 * 分析：
	 * 1，判断的年份的二月份是 29 天，就是闰年，否则就是平年
	 * 2，输出这个月是多少天，通过下个月一号 -1 实现。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("年份：");
		int year = sc.nextInt();
		System.out.println("月份：");
		int month = sc.nextInt();
		getYearMonth(year,month);		
		
	}

	private static void getYearMonth(int year ,int month) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();
		//设置为该年的3月1日
		c.set(year, 2, 1);
		//将日向前减1
		c.add(Calendar.DAY_OF_MONTH, -1);	
		//判断是否是29天
		System.out.println(c.get(Calendar.DAY_OF_MONTH) == 29 ? year + "是一个闰年" : year + "是一个平年"); 
		
		//设置为该年的 month+1 月 1 日
		c.set(year,month, 1);
		c.add(Calendar.DAY_OF_MONTH, -1);
		System.out.println( "这个月的天数： " + c.get(Calendar.DAY_OF_MONTH));
	   
	}
	

}
