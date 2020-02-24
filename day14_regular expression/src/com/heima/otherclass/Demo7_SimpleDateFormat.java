package com.heima.otherclass;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo7_SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
//		demo1();
//		demo2();
//		demo3();
		
		//将时间字符串转换成日期对象
		String str = "2000年08月06日 08:08:08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		Date d = sdf.parse(str);                 //将时间字符串转换成日期对象
		System.out.println(d);
	}

	private static void demo3() {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");   //创建日期格式化类对象
		System.out.println(sdf.format(d));                                  //将日期对象转换成字符串
	}

	private static void demo2() {
		Date d = new Date();                     //获取当前时间
		SimpleDateFormat sdf = new SimpleDateFormat(); //创建日期格式化类对象
		System.out.println(sdf.format(d));          //20-1-9 下午8:12
	}

	private static void demo1() {
		//DateFormat df = new DateFormat();    //DateFormat是抽象类，不允许实例化 
		//DateFormat df1 = new SimpleDateFormat();  
		
		DateFormat df1 = DateFormat.getDateInstance(); //相当于父类引用指向子类对象,右边的方法返回一个子类对象
	}

}
