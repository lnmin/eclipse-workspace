package com.heima.threadmethod;

public class Demo4_Daemon {

	/**
	 * @param args
	 * �ػ��߳�
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread() {
			public void run() {
				for(int i = 0 ; i < 2 ; i++) {
					System.out.println(getName() + ".aaaaaaaaaaaaa");
				}
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0 ; i < 50 ; i++) {
					System.out.println(getName() + ".....a");
				}
			}
		};
		
		t2.setDaemon(true);              //������true������ζ������Ϊ�ػ��߳�
		t1.start();
		t2.start();
		
	}

}
