package com.heima.syn;

public class Demo2_Synchronized {

	/**
	 * @param args
	 * ͬ�������
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer2 p = new Printer2();
		
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

class Printer2{
	//�Ǿ�̬��ͬ����������������ʲô��
	//�� �Ǿ�̬��ͬ����������������this
	//��̬��ͬ��������������ʲô��
	//�Ǹ�����ֽ������
	public synchronized void print1() {
		                   
			System.out.print("��");
			System.out.print("Ա");
			System.out.print("��");
			System.out.print("��");
			System.out.print("Ա");
			System.out.println("\r\n");
		
		
	}
	
	public void print2() {
		synchronized(this) {
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("\r\n");
		}
			
		
		
	}
}

