package com.heima.generic;

public class Demo4_Generic {

	/*
	 * A:���ͽӿڸ���
	* �ѷ��Ͷ����ڽӿ���
*      B:�����ʽ	
	* public interface �ӿ���<��������>
*      C:������ʾ
	* ���ͽӿڵ�ʹ��
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
interface Inter<T> {
	public void show(T t);
}
	

	/*class Demo implements Inter<String> {   //�Ƽ�������
		
		public void show (String t) {
			System.out.println(t);
		}
	}*/

class Demo1<T> implements Inter<T>{         //û�б�Ҫ��ʵ�ֽӿڵ�ʱ����Լ���ӷ���

	@Override
	public void show(T t) {
		// TODO Auto-generated method stub
		System.out.println(t);
	}
	
}

}
