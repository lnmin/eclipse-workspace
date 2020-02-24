package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo8_HashMap {

	/*
	 * 集合嵌套之HashMap嵌套HashMap
	 * 
	 * 需求：
	 * 鸿运驾校有很多基础班
	 * 第88期基础班定义成一个双列集合，键是学生对象，值是学生的归属地
	 * 第89期基础班定义成一个双列集合，键是学生对象，值是学生的归属地
	 * 
	 * 无论是88 还是 89 期都是班级对象，所以为了便于统一管理，把这些班级对象添加到驾校集合中
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 定义88期基础班
		HashMap<Student, String> hm88 = new HashMap<Student, String>();
		hm88.put(new Student("张三", 23), "北京");
		hm88.put(new Student("张三", 23), "太原");
		hm88.put(new Student("张三", 25), "无锡");
		hm88.put(new Student("李四", 24), "上海");
		hm88.put(new Student("王五", 25), "广州");
		hm88.put(new Student("赵六", 26), "深圳");
		// 定义89期基础班
		HashMap<Student, String> hm89 = new HashMap<Student, String>();
		hm89.put(new Student("贝贝", 23), "北京");
		hm89.put(new Student("琪琪", 25), "太原");
		hm89.put(new Student("艾艾", 26), "无锡");
		hm89.put(new Student("保保", 36), "上海");

		// 定义驾校
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hm88, "第88期基础班");
		hm.put(hm89, "第89期基础班");

		// 遍历双列集合
		for (HashMap<Student, String> jiaxiao_class : hm.keySet()) { // hm.keySet() 代表的是双列集合中键的集合
			String value = hm.get(jiaxiao_class);                         //get(jiaxiao)根据键对象获取值对象
			//遍历键的双列集合对象
			for (Student key : jiaxiao_class.keySet()) {      //jiaxiao_class.keySet()获取集合中所有的学生键对象
				String value2 = jiaxiao_class.get(key);
				
				System.out.println(key + "= " + value2 + "= " + value);
			}

		}
	}

}
