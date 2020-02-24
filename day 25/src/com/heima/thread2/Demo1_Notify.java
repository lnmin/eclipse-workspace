package com.heima.thread2;

public class Demo1_Notify {
	 /**
	 * @param args
	 * �ȴ����ѻ���
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


//�ȴ����ѻ���
class Printer{
	private int flag = 1;
	public void print1() throws InterruptedException {
		   synchronized (this) {
			   if(flag != 1) {
				   this.wait();        //��ǰ�̵߳ȴ�
			   }
			   System.out.print("��");
			   System.out.print("Ա");
			   System.out.print("��");
			   System.out.print("��");
			   System.out.print("Ա");
			   System.out.println("\r\n");
			   flag = 2;
			   this.notify();           //������ѵ����ȴ����߳�
		}                
			
		
		
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			if(flag != 2) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("\r\n");
			flag = 1;
			this.notify();
		}
			
		
		
	}
}
