package com.heima.thread;

public class Demo2_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();           //����Thread����������
		mt.start();                             //�����߳�
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("22");
		}
	}

}

class MyThread extends Thread{                   //�̳�Thread
	public void run() {                          //��дrun����
		for (int i = 0; i < 1000; i++) {         //��Ҫִ�еĴ���д��run������
			System.out.println("11111111111111111111");
		}
	}
}
