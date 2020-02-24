package com.heima.otherclass;

import java.util.Date;

public class Demo6_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
		Date d1 = new Date();
		d1.setTime(1000);                     //设置毫秒值，改变时间对象
		System.out.println(d1);

	}

	private static void demo2() {
		Date d1 = new Date();
		System.out.println(d1.getTime());                     //通过时间对象获取毫秒值
		System.out.println(System.currentTimeMillis());       //通过系统类的方法获取当前时间毫秒值
	}

	private static void demo1() {
		Date d1 = new Date();       //util下的包
		System.out.println(d1);
		
		Date d2 = new Date(0);     //如果构造方法中参数传为0， 代表的是 1970年1月1日
		System.out.println(d2);    //通过毫秒值创建时间对象
	}

}
