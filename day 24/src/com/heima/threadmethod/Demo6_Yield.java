package com.heima.threadmethod;

public class Demo6_Yield {

	/**
	 * @param args
	 * yield�ó�cpu�����߳�
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyThread().start();
		new MyThread().start();
	}

}

class MyThread extends Thread{
	public void run() {
		for(int i = 1; i <= 1000; i++) {
			if(i % 10 == 0) {
				Thread.yield();                //�ó�cpu
			}
			System.out.println(getName() + "..." + i);
		}
	}
}