package com.heima.otherclass;

import java.math.BigDecimal;

public class Demo5_BigDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//         System.out.println(2.0 - 1.1);
		/*BigDecimal bd1 = new BigDecimal(2.0);     //这种方式在开发中不推荐，因为不够精确
		BigDecimal bd2 = new BigDecimal(1.1);
		
		System.out.println(bd1.subtract(bd2));*/
		
		/*	BigDecimal bd1 = new BigDecimal("2.0");     //通过构造中传入字符串的方式，开发时推荐
			BigDecimal bd2 = new BigDecimal("1.1");
			
			System.out.println(bd1.subtract(bd2));*/
		
		BigDecimal bd1 = BigDecimal.valueOf(2.0);     //这种方法也推荐
		BigDecimal bd2 = BigDecimal.valueOf(1.1);
		
		System.out.println(bd1.subtract(bd2));    //减法
		

	}

}
