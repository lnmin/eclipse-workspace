package com.heima.thread2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3_ReentrantLock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer3 p = new Printer3();
		
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
		new Thread() {
			public void run() {
				while(true) {
					try {
						p.print3();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}.start();
	}

}


class Printer3{
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	
	private int flag = 1;
	public void print1() throws InterruptedException {
		   r.lock();
			   if(flag != 1) {
				 c1.await();
			   }
			   System.out.print("黑");
			   System.out.print("员");
			   System.out.print("程");
			   System.out.print("序");
			   System.out.print("员");
			   System.out.println("\r\n");
			   flag = 2;
			  // this.notify();           //随机唤醒单个等待的线程
			  c2.signal();
		    r.unlock();             
			
		
		
	}
	
	public void print2() throws InterruptedException {
		r.lock();
			if(flag != 2) {
				c2.await();
			}
			System.out.print("北");
			System.out.print("上");
			System.out.print("广");
			System.out.print("不");
			System.out.print("相");
			System.out.print("信");
			System.out.println("\r\n");
			flag = 3;
//			this.notify();
			c3.signal();
		r.unlock();
			
			
	}
	
	public void print3() throws InterruptedException {
		r.lock();
			if(flag != 3) {                    
				c3.await();
			}
			System.out.print("1");
			System.out.print("2");
			System.out.print("3");
			System.out.print("4");
			System.out.print("5");
			System.out.print("6");
			System.out.println("\r\n");
			flag = 1;
//			this.notify();
			c1.signal();
		r.unlock();
		
		
	}
}