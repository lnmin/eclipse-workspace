package com.stx.p9;

import java.util.Scanner;

public class Demo_p9 {

	/*
	 * 系统自动产生一个随机数a，程序提示用户输入猜的数字b，
	 * 用户输入后程序判断b与a 的大小并提示猜大了或猜小了，
	 * 请用户重新猜。。。循环这个过程直到猜中数字
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("请输入一个整数，范围在 1 - 100中间");
		Scanner sc = new Scanner(System.in);
		final int a = (int)(Math.random() *100) + 1;
		while(true) {
			int b = sc.nextInt();
			if(b > a) {
				System.out.println("猜大了");
			}else if(b < a) {
				System.out.println("猜小了");
			}else {
				System.out.println("恭喜你 猜对啦！！！");
				break;
			}
		}
		
		
	}

}
