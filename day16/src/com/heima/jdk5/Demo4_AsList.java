package com.heima.jdk5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo4_AsList {

	/*
	 * ����ת����
	 * ����ת���ϣ���Ȼ�������ӻ��߼���Ԫ�أ����ǡ������ü��ϵ�˼��������飬Ҳ����˵����ʹ���������Ϸ���
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		demo1();
//      deme2();
		
		// ����ת���顡�ӷ���
		ArrayList<String> list = new ArrayList<String>();
		list.add("a");
		list.add("v");
		list.add("c");
		list.add("s");
		
		String[] arr = list.toArray(new String[0]);    //������ת������ʱ�����鳤�����С�ڵ��ڼ��ϵ�size����ʱ��ת��������鳤�ȵ��ڼ���
                                                           //�������ĳ���
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void deme2() {
		//		int[] arr = {11,22,33,4,5,566,2};
		//		List<int[]> list = Arrays.asList(arr);   //�����������͵�����ת���ɼ��ϣ��Ὣ�������鵱��һ������ת��
		//		System.out.println(list);
				Integer[] arr = {11,22,33,44,55};          //������ת���ɼ��ϣ����������������������
				List<Integer> list = Arrays.asList(arr);
				System.out.println(list);
	}

	private static void demo1() {
		String[] arr = {"a","b","c"};
		List<String> list = Arrays.asList(arr);     //������ת���ɼ���
		
		System.out.println(list);
		list.add("d");
	}

}
