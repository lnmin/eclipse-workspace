package com.heima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo8_Pattern {
/*
		 * Pattern p = Pattern.compile("a*b");    //��ȡ��������ʽ
		 * Matcher m = p.matcher("aaaaab");       //��ȡƥ����
		 * boolean b = m.matches();               //���Ƿ���ƥ�䣬ƥ��ͷ���true
		 ���󣺰�һ���ַ����е��ֻ������ȡ����
		 
		 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "�ҵ��ֻ�������18956544546�������ù�13556894578�����ù�18845862345";
		
		String regex = "1[839]\\d{9}";    //�ֻ������������ʽ
		
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
