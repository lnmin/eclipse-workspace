package com.heima.collection;

import com.heima.bean.Student;

public class Demo1_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] arr = new int[5];                          //����������������
		Student[] arr = new Student[5];                   //��������������������
		arr[0] = new Student("����",23);                   //����һ��ѧ�����󣬴洢������ĵ�һ��λ��
		arr[1] = new Student("����",24);
		arr[2] = new Student("����",25);
		arr[3] = new Student("����",23);
		arr[4] = new Student("����",23);
		 
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	} 

}
