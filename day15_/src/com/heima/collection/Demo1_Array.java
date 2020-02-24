package com.heima.collection;

import com.heima.bean.Student;

public class Demo1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = new int[5];                          //创建基本类型数组
		Student[] arr = new Student[5];                   //创建引用数据类型数组
		arr[0] = new Student("张三",23);                   //创建一个学生对象，存储在数组的第一个位置
		arr[1] = new Student("李四",24);
		arr[2] = new Student("王五",25);
		arr[3] = new Student("张三",23);
		arr[4] = new Student("张三",23);
		 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	} 

}
