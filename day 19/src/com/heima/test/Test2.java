package com.heima.test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Test2 {

	/*
	 * ����¼��һ��int���͵�����,����������Ʊ�����ʽ
	 * ���¼�����������,������ʾ,¼�����������������¼��һ������BigInteger
	 * ���¼�����С��,������ʾ,¼�����С��,������¼��һ������
	 * ���¼����������ַ�,������ʾ,¼����ǷǷ��ַ�,������¼��һ������
	 * 
	 * ������
	 * 1����������¼�����
	 * 2��������¼��Ľ�����洢��String�����ַ����У��洢int����������в�����������ֱ�ӱ����޷����к����ж�
	 * 3������¼��Ľ��ת����int���͵����ݣ�����ȷ�Ļ��Ǵ����
	 * 4����ȷ��ֱ��ת��
	 * 5�������Ҫ���ж�Ӧ�ж�
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��������");
		
		while(true) {
			String line = sc.nextLine();
			
			try {
			    int num = Integer.parseInt(line);                   //���ַ���ת��Ϊ����
			    System.out.println(Integer.toBinaryString(num));    //������תΪ������
			    break;                                              //����ѭ��
			}catch(Exception e) {
				try {
					new BigInteger(line);
					System.out.println("¼�������¼�����һ�����������������������һ��������");
				} catch (Exception e2) {                         //alt + shift + z (try catch��ݼ�)
					// TODO: handle exception
					try {
						new BigDecimal(line);
						System.out.println("¼�������¼�����һ��С��������������һ��������");
					} catch (Exception e3) {
						// TODO: handle exception
						System.out.println("¼�������¼�����һ���Ƿ��ַ�������������һ��������");
					}
				
				}
				
			}
		}
		
	}

}
