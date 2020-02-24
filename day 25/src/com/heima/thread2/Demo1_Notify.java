package com.heima.thread2;

public class Demo1_Notify {
	 /**
	 * @param args
	 * 等待唤醒机制
	 * 
	 */
	public static void main(String[] args) {
		Printer p = new Printer();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print1();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
		
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print2();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}
}


//等待唤醒机制
class Printer{
	private int flag = 1;
	public void print1() throws InterruptedException {
		   synchronized (this) {
			   if(flag != 1) {
				   this.wait();        //当前线程等待
			   }
			   System.out.print("黑");
			   System.out.print("员");
			   System.out.print("程");
			   System.out.print("序");
			   System.out.print("员");
			   System.out.println("\r\n");
			   flag = 2;
			   this.notify();           //随机唤醒单个等待的线程
		}                
			
		
		
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			if(flag != 2) {
				this.wait();
			}
			System.out.print("北");
			System.out.print("上");
			System.out.print("广");
			System.out.print("不");
			System.out.print("相");
			System.out.print("信");
			System.out.println("\r\n");
			flag = 1;
			this.notify();
		}
			
		
		
	}
}
