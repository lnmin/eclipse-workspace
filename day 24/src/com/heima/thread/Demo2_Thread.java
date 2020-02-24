package com.heima.thread;

public class Demo2_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt = new MyThread();           //创建Thread类的子类对象
		mt.start();                             //开启线程
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("22");
		}
	}

}

class MyThread extends Thread{                   //继承Thread
	public void run() {                          //重写run方法
		for (int i = 0; i < 1000; i++) {         //将要执行的代码写在run方法中
			System.out.println("11111111111111111111");
		}
	}
}
