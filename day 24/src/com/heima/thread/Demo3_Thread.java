package com.heima.thread;

public class Demo3_Thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyRunnable mr = new MyRunnable();               //创建Runnable的子类对象
		//Runnable target = mr; mr = ox11
		Thread t = new Thread(mr);                      //将其当作参数传递给Thread的构造函数
		t.start();
		
		for (int i = 0; i < 1000; i++) {
			System.out.println("11");
		}
	}

}


class MyRunnable implements Runnable{                    //定义一个类实现Runnable
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("222222222222222222");
		}
	}
}