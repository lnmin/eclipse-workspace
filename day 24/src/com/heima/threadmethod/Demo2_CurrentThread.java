package com.heima.threadmethod;

public class Demo2_CurrentThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {
			public void run() {
				System.out.println(getName() + "..aaa");
			}
		}.start();
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				//Thread.currentThread()��ȡ��ǰ����ִ�е��߳�
				System.out.println(Thread.currentThread().getName() + ".. bb");
			}
		}).start();
		
		Thread.currentThread().setName("�������߳�");
		System.out.println(Thread.currentThread().getName());
		
	}

}
