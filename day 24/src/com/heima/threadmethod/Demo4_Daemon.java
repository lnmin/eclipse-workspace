package com.heima.threadmethod;

public class Demo4_Daemon {

	/**
	 * @param args
	 * 守护线程
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
		
		t2.setDaemon(true);              //当传入true就是意味者设置为守护线程
		t1.start();
		t2.start();
		
	}

}
