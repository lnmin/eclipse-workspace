package com.heima.test;

import java.math.BigInteger;

public class Test6 {

	/**
	 * @param args
	 * 需求：求出1000的阶乘和尾部零的个数，不用递归做
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//因为1000阶乘远远超过int的取值范围，所以不能用int ，用BigInteger
//		demo1();
		
		demo2();
	}

	private static void demo2() {             //获取1000的阶乘尾部有多少个零
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+ "");
			bi1 = bi1.multiply(bi2);        //将bi1与bi2相乘的结果赋值给bi1
		}
		String str = bi1.toString();       //获取字符串表现形式
		StringBuilder sb = new StringBuilder(str);
		str = sb.reverse().toString();      //链式编程
		
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if('0' != str.charAt(i)) {
				break;
			}else {
				count++;
			}
		}
		
		System.out.println(count);
	}

	private static void demo1() {               //求1000的阶乘中所有的零
		BigInteger bi1 = new BigInteger("1");
		for(int i = 1; i <= 1000; i++) {
			BigInteger bi2 = new BigInteger(i+ "");
			bi1 = bi1.multiply(bi2);        //将bi1与bi2相乘的结果赋值给bi1
		}
		String str = bi1.toString();       //获取字符串表现形式
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if('0' == str.charAt(i)) {     //如果字符串中出现 0 字符
				count++;                   //计数器加1
			}
		}
		 
		System.out.println(count);
	}

}
