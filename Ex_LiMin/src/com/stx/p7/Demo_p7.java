package com.stx.p7;

import java.util.Arrays;
import java.util.Scanner;

public class Demo_p7 {

	/*
	 * ѧУ�����ֳ���10����ί��Ҫ��Ӽ�������10��������Ϊ��ί��һ��ѡ�ֵĴ�֣�
	 * ���ֹ���Ϊȥ��һ����߷֣�ȥ��һ����ͷ֣������ѡ��ƽ���֣���ӡ������̨��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("����������10λ��ί�����֣�");
		float num = 0;
		float[] arr = new float[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextFloat();
		}
		
		//����
		Arrays.sort(arr);
//		System.out.println(Arrays.toString(arr));
		
		System.out.println("ȥ��һ����߷֣�" + arr[arr.length-1]);
		System.out.println("ȥ��һ����ͷ֣�" + arr[0]);
		for (int i = 1; i < arr.length -1; i++) {
			num += arr[i];
		}
		System.out.println("���÷֣�" + (num / 8));
	}

}
