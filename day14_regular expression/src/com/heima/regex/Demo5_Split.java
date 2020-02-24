package com.heima.regex;

public class Demo5_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		String s = "金山爸爸.经济.封jkgja";
		String[] arr = s.split("\\.");    //通过正则表达式切割字符串
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void demo1() {
		String s = "金山爸爸 经济 封景jkgja";
		String[] arr = s.split(" ");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
