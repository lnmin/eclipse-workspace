package com.heima.thread;

public class Demo1_Singleton {
	/**
	 * @param args
	 * �������ģʽ����֤�����ڴ���ֻ��һ������
	 * 
	 */
	public static void main(String[] args) {
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.s;            //��Ա������˽�У�����ͨ������.����
		
		Singleton s2 = Singleton.s;
		
		System.out.println(s1 == s2);
		
		/*Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		System.out.println(s1 == s2);*/
	}
}

/*
 * 
 *   ����ʽ
 */
/*class Singleton{
	//˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	//�����������
	private static Singleton s =new Singleton();
	//�����ṩ�����ķ��ʷ���
	public static Singleton getInstance() {             //��ȡʵ��
		return s;
	}
}*/

/*
 *   ����ʽ,�������ӳټ���ģʽ
 */
/*class Singleton{
	//˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	//����һ������
	private static Singleton s;
	//�����ṩ�����ķ��ʷ���
	public static Singleton getInstance() {             //��ȡʵ��
		if(s == null){
			//�߳�1�ȴ����߳�2�ȴ�
			s = new Singleton();
		}
		return s;
	}
}*/

class Singleton{
	//˽�й��췽��,�����಻�ܷ��ʸù��췽��
	private Singleton() {}
	//����
	public static final Singleton s =new Singleton();
	
}

/*
 *  ����ʽ������ʽ������
 *  1������ʽʽ�ռ任ʱ�䣬����ʽ��ʱ�任�ռ�
 *  2���ڶ��̷߳���ʱ������ʽ���ᴴ��������󣬶�����ʽ�п��ܻᴴ���������
 * 
 * 
 * 
 * 
 */
