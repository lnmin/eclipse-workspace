package com.heima.syn;

public class Demo2_Synchronized {

	/**
	 * @param args
	 * 同步代码块
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Printer2 p = new Printer2();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print1();
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					p.print2();
				}
			}
		}.start();
	}

}

class Printer2{
	//非静态的同步方法的锁对象是什么？
	//答： 非静态的同步方法的锁对象是this
	//静态的同步方法锁对象是什么？
	//是该类的字节码对象
	public synchronized void print1() {
		                   
			System.out.print("黑");
			System.out.print("员");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.println("\r\n");
		
		
	}
	
	public void print2() {
		synchronized(this) {
			System.out.print("北");
			System.out.print("上");
			System.out.print("广");
			System.out.print("不");
			System.out.print("相");
			System.out.print("信");
			System.out.println("\r\n");
		}
			
		
		
	}
}

