package com.heima.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test2 {
	/*
		你来到世界多少天
		
		
		分析：
		1，将生日字符串和 今天字符串存在String类型的变量中
		2，定义日期格式化对象
		3，将日期字符串转换成日期对象
		4，通过日期对象后期时间毫秒值
		5，将两个时间毫秒值相减除以 1000，再除以 60 ，再除以24 得到天
		*/
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String birthday = "1997年07月01日 ";
		String today = "2020年05月04日";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		
		Date d1 = sdf.parse(birthday);
		Date d2 = sdf.parse(today);
		
		long time = d2.getTime() - d1.getTime();
		
		System.out.println(time / 1000 / 60 / 60 / 24 /365);
		

	}

}
