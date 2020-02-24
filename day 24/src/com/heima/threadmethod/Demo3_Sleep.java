package com.heima.threadmethod;

public class Demo3_Sleep {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//		demo1();
		new Thread() {
			public void run() {
				for(int i = 0 ; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + "..aa");
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				for(int i = 0 ; i < 10; i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + "...b");
				}
			}
		}.start();
	}

	private static void demo1() throws InterruptedException {
		for (int i = 20; i >= 0; i--) {
			Thread.sleep(1000);
			System.out.println("µπº∆ ±" + i +"√Î");
		}
	}

}
