package com.heima.thread;

public class Demo4_Thread {

	/**
	 * @param args
	 * 匿名内部类
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Thread() {                                          //继承Thread类
			public void run() {                                 //重写run方法
				for (int i = 0; i < 1000; i++) {                //将要执行的代码写在run方法中
					System.out.println("1aaaaaaaaaaaa");
				}
			}
		}.start();                                               //开启线程
		
		
		new Thread(new Runnable() {                            //将Runnable的子类对象传递给Thread的构造方法
			public void run() {                                //重写run方法
				for (int i = 0; i < 1000; i++) {                //将要执行的代码写在run方法中
					System.out.println("bbbbbbbbbbbbbbbbbbbbb");
				}
			}
		}).start();                                             //开启线程
	}

}
