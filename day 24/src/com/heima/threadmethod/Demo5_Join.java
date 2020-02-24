package com.heima.threadmethod;

public class Demo5_Join {

	/**
	 * @param args
	 * join(),当前线程暂停，等待指定的线程执行结束后，当前线程再继续
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(getName() + "..aaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 100; i++) {
					if(i == 2) {
						try {
//							t1.join();
							t1.join(1);                  //插队指定的时间，过类制定时间后，两条线程交替执行
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}           //匿名内部类在使用它所在方法中的局部变量时，必须用final 修饰
					}
					System.out.println(getName() + "..bbb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
