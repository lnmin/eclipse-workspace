package com.stx.p4;

public class Demo_p4 {

	/*
	 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//　leijiahe(第一个分数的分子，　第一个分数的分母，　要对前多少项求和)
     	leijiahe(2,1,20);		
	}

	public static void leijiahe(int z, int m, int n) {
		
		double[][] arr = new double[n][2];
		double sum =0.0;
		arr[0][0] = z;
		arr[0][1] = m;
		for (int i = 1; i < arr.length; i++) {
			arr[i][0] = arr[i-1][0] + arr[i-1][1];
			arr[i][1] = arr[i-1][0];
		}
	
		for (int i = 0; i < arr.length; i++) {
			 
			sum = sum +arr[i][0] / arr[i][1];
		}
		
		System.out.println(sum);
	}
	
}
