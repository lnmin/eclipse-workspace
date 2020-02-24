package com.heima.regex;

public class Demo5 {
   /**
	 *@param class body
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wogf1hfakjg";
		String regex = "\\d";    // \\d代表的是任意数字
		
		String s2 = s.replaceAll(regex, "");    //正则表达式的替换功能
		System.out.println(s2);

	}
	
}
