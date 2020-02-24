package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {

	/*
	 * 数组转集合
	 * 数组转集合，虽然不能增加或者减少元素，但是　可以用集合的思想操作数组，也就是说可以使用其他集合方法
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//      deme2();
		
		// 集合转数组　加泛型
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("v");
		list.add("c");
		list.add("s");
		
		String[] arr = list.toArray(new String[0]);    //当集合转换数组时，数组长度如果小于等于集合的size集合时，转换后的数组长度等于集合
                                                           //如果数组的长度
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void deme2() {
		//		int[] arr = {11,22,33,4,5,566,2};
		//		List<int[]> list = Arrays.asList(arr);   //基本数据类型的数组转换成集合，会将整个数组当作一个对象转换
		//		System.out.println(list);
				Integer[] arr = {11,22,33,44,55};          //将数组转换成集合，数组必须是引用数据类型
				List<Integer> list = Arrays.asList(arr);
				System.out.println(list);
	}

	private static void demo1() {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);     //将数组转换成集合
		
		System.out.println(list);
		list.add("d");
	}

}
