package com.heima.regex;

public class Demo5 {
   /**
	 *@param class body
	
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "wogf1hfakjg";
		String regex = "\\d";    // \\d���������������
		
		String s2 = s.replaceAll(regex, "");    //������ʽ���滻����
		System.out.println(s2);

	}
	
}
