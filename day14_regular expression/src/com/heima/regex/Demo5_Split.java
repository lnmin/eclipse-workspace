package com.heima.regex;

public class Demo5_Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		demo1();
		String s = "��ɽ�ְ�.����.��jkgja";
		String[] arr = s.split("\\.");    //ͨ��������ʽ�и��ַ���
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	private static void demo1() {
		String s = "��ɽ�ְ� ���� �⾰jkgja";
		String[] arr = s.split(" ");
		for (int i=0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
