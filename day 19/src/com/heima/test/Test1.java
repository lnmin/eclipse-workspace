package com.heima.test;

public class Test1 {

	/*
	 * ������1��
	 *     final,finally,finalize ������
	 *     
	 *       final���������࣬���ܱ��̳�
	 *       ���η��������ܱ���д
	 *       ���α�����ֻ�ܸ�ֵһ��
	 *       
	 *       finally ��try ����е�һ������壬���ܵ���ʹ�ã������ͷ���Դ
	 *       
	 *       finalize ��һ��������������������ȷ�������ڶԸö���ĸ�������ʱ���ɶ�����������������ô˷�����
	 * 
	 * ������2��
	 *      ���catch������teturn��䣬����finally�Ĵ��뻹��ִ��������ᣬ������returnǰ ���Ǻ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Demo a = new Demo();
		System.out.println(a.method());
	}

}
class Demo{
	public int method() {
		int x = 10;
		try {
			x= 20;
			System.out.println( 1/0);
			return x;
		}catch(Exception e) {
			x = 30;
			return x;
		}finally {
			x = 40;
//			return x;    //ǧ��Ҫ��finally����д������䣬��Ϊfinally��������Ϊ���ͷ���Դ��    �ǿ϶���ִ�еġ�
		}
	}
}