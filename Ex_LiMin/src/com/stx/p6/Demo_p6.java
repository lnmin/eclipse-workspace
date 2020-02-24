package com.stx.p6;

import java.util.Scanner;

public class Demo_p6 {

	/*
	 * 从键盘输入10个整数，保存到数组中，对数组中的元素按照从大到小的顺序进行排序。
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("键盘输入n个整数，n =");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr);
		
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i = 0; i < arr.length -1; i++) {
			for (int j = 0; j < arr.length -1 -i; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

}
