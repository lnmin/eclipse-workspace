package com.heima.jdk5;

public class Demo3_ChangeableArgs {
	/*
	 * A:�ɱ��������
	* ���巽����ʱ��֪���ö�����ٸ�����
*      B:��ʽ
	* ���η� ����ֵ���� ������(�������͡�  ������){}
*      C:ע�����
	* ����ı�����ʵ��һ������
	* ���һ�������пɱ�����������ж����������ô���ɱ�����϶������һ��
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {11,22,33,44,55};
//		print(arr);
		print(11,22,33,44,55,66,77);
	}
	
	/*public static void print(int[] arr) {
		for (int i : arr) {
			System.out.println(i);
		}
	}*/
	
	public static void print(int ... arr) {        //�ɱ������ʵ��һ������
	    for (int i : arr) {
			System.out.println(i);
		}
	}

}