package com.stx.p2;

import java.util.Scanner;

public class Demo_p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("��ֵ200");
		System.out.println("(1.�ǡ���2.��)��������������");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		if(i == 1) {
			System.out.println("(1.�ǡ���2.��)���Ż��ײͣ�");
			int ii = sc.nextInt();
			if(ii  ==1) {
				System.out.println("(1.�ǡ���2.��)��ֵ��ͣ��");
				int iii = sc.nextInt();
				if(iii == 1) {
					System.out.println("��ֵ�ɹ����·����ͣ�����������");
				}else {
					System.out.println("��ֵ�ɹ����·������ͻ�������");
				}
			}else {
				System.out.println("��ֵ�ɹ����·������ͻ�������");
			}
		}else {
			System.out.println("��ֵ�ɹ����·������ͻ�������");
		}
	}

}
