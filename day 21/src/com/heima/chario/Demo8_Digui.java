package com.heima.chario;

public class Demo8_Digui {

	/**
	 * @param args
	 * �ݹ飺�����Լ������Լ�
	 * 5��
	 * 
	 * �ݹ�ı׶ˣ����ܵ��ô������࣬���׵���ջ�ڴ����
	 * �ݹ�ĺô�������֪��ѭ������
	 * 
	 * ���췽������ʹ�õݹ����
	 * ��һ���з���ֵ
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fun(10000));
	}
	
	public static int fun(int num) {
		if(num == 1) {
			return 1;
		}else {
			return num * fun(num -1);
		}
	}

}
