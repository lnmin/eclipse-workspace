package com.heima.thread;

public class Demo3_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr = new MyRunnable();               //����Runnable���������
		//Runnable target = mr; mr = ox11
		Thread t = new Thread(mr);                      //���䵱���������ݸ�Thread�Ĺ��캯��
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("11");
		}
	}

}


class MyRunnable implements Runnable{                    //����һ����ʵ��Runnable
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("222222222222222222");
		}
	}
}