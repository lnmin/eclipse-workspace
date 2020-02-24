package com.stx.p7;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_p7 {

	/*
	 * 学校比赛现场有10个评委，要求从键盘输入10个分数作为评委对一名选手的打分，
	 * 评分规则为去掉一个最高分，去掉一个最低分，求该名选手平均分，打印到控制台。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("请依次输入10位评委的评分：");
		float num = 0;
		float[] arr = new float[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}
		
		//排序
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		System.out.println("去掉一个最高分：" + arr[arr.length-1]);
		System.out.println("去掉一个最低分：" + arr[0]);
		for (int i = 1; i < arr.length -1; i++) {
			num += arr[i];
		}
		System.out.println("最后得分：" + (num / 8));
	}

}
