package com.stx.p3;

import java.util.Scanner;

public class Demo_p3 {
	/*
	 * ���һ���������·���ϵͳ���������£�
            ��1��ϵͳ��������ʾ�û��������±�������n��
            ��2���û��ӿ���̨����ÿƪ���µı��⣬ֱ��nƪ���±���������ɣ�
            ��3����ʾ���е����±��⣬������ⳤ�ȴ���10����ֻ��ʾǰ10���ַ���

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("�ƻ���������±��������ǣ�");
		Scanner sc = new Scanner(System.in);
		//��Stringת��Ϊint
		String s = sc.nextLine();
		int n = Integer.parseInt(s);
		
		String[] arr = new String[n];
	
		for ( int i =0; i < arr.length ; i++) {
			System.out.println("�����" + (i+1) + "�µı��⣺" );
			arr[i] = sc.nextLine();								
		}

		System.out.println("��ʾ���⣺");
		
		for ( int i = 0; i < arr.length; i++) {
			System.out.print((i+1)+ ".");
			//������ⳤ�ȴ��ڣ�����ֻ��ʾǰ�������ַ�
			if(arr[i].length() > 10) {
			    
				System.out.println(arr[i].substring(0,10));   
			}else {
				System.out.println(arr[i]);
			}
			
		}
		
		
	}

	
	

}
