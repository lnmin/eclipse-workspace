package com.heima.syn;

public class Demo1_Synchronized {

	/**
	 * @param args
	 * ͬ�������
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	}

}

class Printer{
	Demo d = new Demo();
	public void print1() {
		synchronized(d) {                     //ͬ������飬������,���������������ġ� ��������������������Ϊ����������ͬһ������
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.println("\r\n");
		}
		
	}
	public void print2() {
		synchronized(d) {
			System.out.print("��");
			System.out.print("��");
			System.out.println("\r\n");
		}
		
	}
}

class Demo{
	
}