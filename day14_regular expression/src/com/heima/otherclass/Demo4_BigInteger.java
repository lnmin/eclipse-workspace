package com.heima.otherclass;

import java.math.BigInteger;

public class Demo4_BigInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    String s = "1346798123456789456";
	   BigInteger bi1 = new BigInteger("100");
	   BigInteger bi2 = new BigInteger("2");
	   
	   System.out.println(bi1.add(bi2));              // +
	   System.out.println(bi1.subtract(bi2));         // -
	   System.out.println(bi1.multiply(bi2));         // *
	   System.out.println(bi1.divide(bi2));         // /(除)
	   
	   BigInteger[] arr = bi1.divideAndRemainder(bi2);    //取除数 与 余数
	   for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	   
	   
	   

	}

}
