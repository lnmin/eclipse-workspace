package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8_Pattern {
/*
		 * Pattern p = Pattern.compile("a*b");    //获取到正则表达式
		 * Matcher m = p.matcher("aaaaab");       //获取匹配器
		 * boolean b = m.matches();               //看是否能匹配，匹配就返回true
		 需求：把一个字符串中的手机号码获取出来
		 
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "我的手机号码是18956544546，曾经用过13556894578，还用过18845862345";
		
		String regex = "1[839]\\d{9}";    //手机号码的正则表达式
		
		/*Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		boolean b = m.matches();
		
		System.out.println(b);*/
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(s);
		/*boolean b1 = m.find();
		System.out.println(b1);
		
		String s1 = m.group();
		System.out.println(s1);*/
		
		while(m.find()) {
			System.out.println(m.group());
		}
		
		
		

	}

}
