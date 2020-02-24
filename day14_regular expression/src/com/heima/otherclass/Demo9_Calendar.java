package com.heima.otherclass;

import java.util.Calendar;

public class Demo9_Calendar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
		Calendar c = Calendar.getInstance();
		c.add(Calendar.YEAR, -1);                    //对制定的字段进行向前减 或 向后加
		c.set(Calendar.YEAR, 2000);                  //修改指定字段
		c.set(2000, 8, 9);                           //
		
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum((c.get(Calendar.MONTH)+1)) + "月"
				+ getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
		
	}
	private static void demo1() {
		Calendar c = Calendar.getInstance();     //父类引用指向子类对象
//		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));  //通过字段获取年
		System.out.println(c.get(Calendar.MONTH));  //通过字段获取月，但是月从0开始编号
		
		System.out.println(c.get(Calendar.DAY_OF_MONTH));   //月中第几天
		System.out.println(c.get(Calendar.DAY_OF_WEEK));    //周日是第一天，周六是最后一天
		
		System.out.println(c.get(Calendar.YEAR) + "年" + getNum((c.get(Calendar.MONTH)+1)) + "月"
				+ getNum(c.get(Calendar.DAY_OF_MONTH)) + "日" + getWeek(c.get(Calendar.DAY_OF_WEEK)));
	}
	/*
	 * 将星期存储表中进行查表
	 * 1，返回值类型String
	 * 2，参数列表 int week
	 * 
	 * 
	 * 
	*/
	public static String getWeek(int week) {
		String[] arr = {"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return arr[week];
	}
	
	/*
	 * 如果是个位数字前面补0
	 * 1，返回值类型String类型
	 * 2，参数列表，int num
	 * 
	*/
	
	public static String getNum(int num) {
		/*if(num > 9) {
			return "" + num;
		}else {
			return "0" + num;
		}*/
		return num > 9 ? "" + num : "0" + num;
		
	}
	
	
	
	
	
}
