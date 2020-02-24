package com.heima.thread2;

import javax.xml.stream.events.StartDocument;

public class Demo2_NotifyAll {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer2 p = new Printer2();
		 
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

/*
 * 1����ͬ��������У����ĸ��������������ĸ��������wait����
 * 2��Ϊʲôwait������notify����������object�����У�
 *    ��Ϊ���������������object�����е���Ļ��࣬����wati��������notify������Ҫ������object�������
 * 3��sleep������wait����������
 *  a��  sleep�������봫���������������ʱ�䣬ʱ�䵽���Զ�����
 *    wait�������Դ������Ҳ���Բ����������������������ڲ���ʱ�������ȴ����������������ֱ�ӵȴ�
 *  b��sleep������ͬ������麯����ͬ��������У����ͷ���
 *     wait������ͬ����������ͬ��������У��ͷ���
 */


class Printer2{
	private int flag = 1;
	public void print1() throws InterruptedException {
		   synchronized (this) {
			   while(flag != 1) {
				   this.wait();        //��ǰ�̵߳ȴ�
			   }
			   System.out.print("��");
			   System.out.print("Ա");
			   System.out.print("��");
			   System.out.print("��");
			   System.out.print("Ա");
			   System.out.println("\r\n");
			   flag = 2;
			  // this.notify();           //������ѵ����ȴ����߳�
			   this.notifyAll();
		   }                
			
		
		
	}
	
	public void print2() throws InterruptedException {
		synchronized(this) {
			while(flag != 2) {
				this.wait();
			}
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.print("��");
			System.out.println("\r\n");
			flag = 3;
//			this.notify();
			this.notifyAll();
		}
			
			
	}
	
	public void print3() throws InterruptedException {
		synchronized(this) {
			while(flag != 3) {                     //�߳�3�ڴ˵ȴ���if�����������ȴ���������������
				this.wait();                       //whileѭ����ѭ���жϣ�ÿ�ζ����жϱ��
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
			this.notifyAll();
		}
		
		
	}
}