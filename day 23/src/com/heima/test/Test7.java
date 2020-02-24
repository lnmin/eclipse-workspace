package com.heima.test;

import java.math.BigInteger;

public class Test7 {

	/**
	 * @param args
	 * 需求：求出1000的阶乘和尾部零的个数，用递归做
	 * 需求:求出1000的阶乘尾部零的个数,用递归做
	 * 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75 80 85 90 95 100...1000  1000 / 5 = 200
	 * 5 * 5	5 * 5 * 2 	5 * 5 * 3	5 * 5 * 4	5 * 5 * 5	5 * 5 * 6	200 / 5 = 40
	 * 5 * 5 * 5 * 1	5 * 5 * 5 * 2	5 * 5 * 5 * 3	5 * 5 *  5 * 4	5 * 5 *  5 * 5	5 * 5 *  5 * 6	5 * 5 *  5 * 7	5 * 5 *  5 * 8
																			40 / 5 = 8
		5 * 5 * 5 * 5	
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(1000));
	}
	
	public static BigInteger jiecheng(int num) {
		BigInteger big = new BigInteger("1");
		if(num == 1) {
			return big;
		}else {
			BigInteger big1 = new BigInteger(num +"");
			big = big1.multiply(jiecheng(num - 1));
		}
		return big;
			
	}
	
	public static int fun(int num) {
		if(num > 0 && num < 5) {
			return 0;
		}else {
			return num / 5 + fun(num / 5);
		}
	}

}
