package com.stx.p9;

import java.util.Scanner;

public class Demo_p9 {

	/*
	 * ϵͳ�Զ�����һ�������a��������ʾ�û�����µ�����b��
	 * �û����������ж�b��a �Ĵ�С����ʾ�´��˻��С�ˣ�
	 * ���û����²¡�����ѭ���������ֱ����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("������һ����������Χ�� 1 - 100�м�");
		Scanner sc = new Scanner(System.in);
		final int a = (int)(Math.random() *100) + 1;
		while(true) {
			int b = sc.nextInt();
			if(b > a) {
				System.out.println("�´���");
			}else if(b < a) {
				System.out.println("��С��");
			}else {
				System.out.println("��ϲ�� �¶���������");
				break;
			}
		}
		
		
	}

}