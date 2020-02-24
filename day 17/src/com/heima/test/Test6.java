package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	/*
	 * ���������󣬿��ԴӼ���������ն��������֪������quit�ǽ������룬����������������������д�ӡ��
	 * 
	 * ������
	 * ���������ӣ��������󣬼���¼��
	 * ���������ԣ���ӣ�����϶��󣬣ԣ���ӣ�������д���Ƚ���
	 * ��������ѭ�����ϵĽ��������������������˳�����Ϊ�˳��У��������Լ���¼���ʱ�򣬶����ַ�������ʽ¼��
	 * �����ж��ǣ��������˳������ǽ���ת��ΪInteger,����ӵ�����
	 * ��������TreeSet���ϲ���ӡÿһ��Ԫ��
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		TreeSet<Integer> ts = new TreeSet<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
//				int num = o2 - o1;                //�Զ�����
				int num = o2.compareTo(o1);
				return num == 0 ? 1 : num;
			}
		});
		
//		 * ��������ѭ�����ϵĽ��������������������˳�����Ϊ�˳��У��������Լ���¼���ʱ�򣬶����ַ�������ʽ¼��
		while(true) {
			String line = sc.nextLine();
			if("quit".equals(line)) {
				break;
			}
//			�����ж��ǣ��������˳������ǽ���ת��ΪInteger,����ӵ�����
			try {
				Integer i = Integer.parseInt(line);
				ts.add(i);
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("¼���������¼��������");
			}
		}
		
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
