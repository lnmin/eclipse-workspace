package com.stx.p6;

import java.util.Scanner;

public class Demo_p6 {

	/*
	 * �Ӽ�������10�����������浽�����У��������е�Ԫ�ذ��մӴ�С��˳���������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.print("��������n��������n =");
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
