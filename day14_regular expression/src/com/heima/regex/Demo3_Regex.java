package com.heima.regex;

public class Demo3_Regex {
	/*
	 * 
	    .  ÈÎºÎ×Ö·û 
	  
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		demo2();
		

		
	}

	private static void demo2() {
		String regex = "\\w";
		System.out.println("s".matches(regex));
		System.out.println("3".matches(regex));
	}

	private static void demo1() {
		String regex = "..";
		System.out.println("a".matches(regex));
		System.out.println("ab".matches(regex));
	}

}
